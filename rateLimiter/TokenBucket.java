package rateLimiter;

public class TokenBucket extends RateLimiter{

    public TokenBucket(Config config) {
        super(config);
    }

    @Override
    public boolean allowRequest(String userId) {
        return false;
    }
}
