package LoggerSystem;

public class Logger {

    private static final Logger instance= new Logger();
    LogHandler chainHandler;
    private Logger(){
     chainHandler=LogHandlerConfiguration.build();
    }
    public static Logger getInstance() {
        return instance;
    }
    public void log(LogLevel level,LogMessage message){
        chainHandler.handle(message);
    }

    public void info(String message){
        LogMessage message1=new LogMessage(LogLevel.INFO,message);
        log(LogLevel.INFO,message1);
    }

    public void warn(String message){
        LogMessage message1=new LogMessage(LogLevel.WARN,message);
        log(LogLevel.WARN,message1);
    }

    public void error(String message){
        LogMessage message1=new LogMessage(LogLevel.ERROR,message);
        log(LogLevel.ERROR,message1);
    }

}
