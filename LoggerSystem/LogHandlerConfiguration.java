package LoggerSystem;

import javax.swing.plaf.PanelUI;

public class LogHandlerConfiguration {

  private static final LogHandler INFO=new Info();
  private static final LogHandler WARN=new Warn();
  private static final LogHandler ERROR=new Error();

    public static LogHandler build(){
       INFO.setNext(WARN);
       WARN.setNext(ERROR);
       return INFO;
    }

    public void addAppender(LogLevel level, Appender appender){

        switch (level){
            case INFO -> INFO.addAppender(appender);
            case WARN -> WARN.addAppender(appender);
            case ERROR -> ERROR.addAppender(appender);
        }
    }
}
