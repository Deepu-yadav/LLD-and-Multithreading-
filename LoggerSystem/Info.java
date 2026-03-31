package LoggerSystem;

public class Info extends LogHandler{
    @Override
    boolean canHandle(LogMessage message) {
        return LogLevel.INFO==message.getLevel();
    }
}
