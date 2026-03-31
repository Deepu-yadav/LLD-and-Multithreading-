package rateLimiter;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class FixedWindow extends RateLimiter{

    private final Map<String,Integer> requestCount=new HashMap<>();
    private final Map<String,Long>startWindow=new HashMap<>();
    public FixedWindow(Config config) {
        super(config);
    }

    @Override
    public boolean allowRequest(String userId) {
        AtomicBoolean allowed=new AtomicBoolean(false);
        long requestWindow=System.currentTimeMillis();
        // if id exist then count=requestCount.get(id);
        requestCount.compute(userId,(Id,count)->{
          long start=startWindow.getOrDefault(userId,0*1L) ;
          if(start!=requestWindow){
              allowed.set(true);
              return 1;
          }
          if(start==0)count=0;
          if(count<config.getMaxRequest()){
              allowed.set(true);
              return count+1;
          }
          return count;
        });
        return allowed.get();
    }
}
