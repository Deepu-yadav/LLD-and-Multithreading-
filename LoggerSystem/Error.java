package LoggerSystem;

public class Error extends LogHandler{
    @Override
    boolean canHandle(LogMessage message) {
        return LogLevel.ERROR==message.getLevel();
    }
}
