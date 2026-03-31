package LoggerSystem;

public class Warn extends LogHandler{
    @Override
    boolean canHandle(LogMessage message) {
        return LogLevel.WARN==message.getLevel();
    }
}
