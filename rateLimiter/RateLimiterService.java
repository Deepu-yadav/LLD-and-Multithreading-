package rateLimiter;

import java.util.HashMap;

public class RateLimiterService {

    HashMap<UserTier,RateLimiter>map=new HashMap<>();

    RateLimiterService(){
        map.put(UserTier.FREE,new SlidingWindowLog(new Config(10,60)));
        map.put(UserTier.PREMIUM,new FixedWindow(new Config(100,60)));
    }

    public boolean allowRequest(User user){
        RateLimiter limiter=map.getOrDefault(user.getTier(),null);
        if(limiter==null){
            throw new RuntimeException("This type is not supported");
        }
       return limiter.allowRequest(user.getId().toString());
    }




}
