package rateLimiter;

public abstract class RateLimiter {

    protected Config config;

    public RateLimiter(Config config){
        this.config=config;
    }

    public abstract boolean allowRequest(String userId);

}
