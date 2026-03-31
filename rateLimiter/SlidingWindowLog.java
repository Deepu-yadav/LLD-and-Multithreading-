package rateLimiter;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class SlidingWindowLog extends RateLimiter{
    private final Map<String,Queue<Long>> log=new ConcurrentHashMap<>();


    public SlidingWindowLog(Config config) {
        super(config);
    }

    @Override
    public boolean allowRequest(String userId) {
        AtomicBoolean allowed=new AtomicBoolean(false);
         long now=System.currentTimeMillis()/1000;
        log.compute(userId, (id,log)->{
              if(log==null)log=new ArrayDeque<>();
              while (!log.isEmpty() && (now-log.peek())>=config.getGivenWindowInSec()){
                  log.poll();
              }
              if(log.size()<config.getMaxRequest()){
                  log.add(now);
                  allowed.set(true);
              }
              return log;

        });
        return allowed.get();

    }
}
