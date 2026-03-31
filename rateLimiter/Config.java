package rateLimiter;

import java.security.PublicKey;

public class Config {

    private int maxRequest;
    private long givenWindowInSec;

    public Config(int maxRequest,long givenWindow){
        this.maxRequest=maxRequest;
        this.givenWindowInSec=givenWindow;
    }

    public int getMaxRequest() {
        return maxRequest;
    }

    public long getGivenWindowInSec() {
        return givenWindowInSec;
    }
}
