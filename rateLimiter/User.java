package rateLimiter;

import java.util.UUID;

public class User {

    private UUID id;
    private UserTier tier;

    public User(UserTier tier) {
        this.id = UUID.randomUUID();
        this.tier = tier;
    }

    public UUID getId() {
        return id;
    }

    public UserTier getTier() {
        return tier;
    }

    public void setTier(UserTier tier) {
        this.tier = tier;
    }
}
