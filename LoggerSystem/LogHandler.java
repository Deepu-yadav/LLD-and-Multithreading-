package LoggerSystem;

import java.util.List;

public abstract class LogHandler {
    LogHandler next;
    List<Appender> appenderList;

    public void addAppender(Appender appender){
        appenderList.add(appender);
    }

    public LogHandler getNext() {
        return next;
    }

    public void setNext(LogHandler next) {
        this.next = next;
    }
    abstract boolean canHandle(LogMessage message);

    public void handle(LogMessage message){
        if(canHandle(message)){
          informAllAppender(message);
        }
        else if(next!=null){
            next.handle(message);
        }
    }

    public void informAllAppender(LogMessage message){
        for(Appender appender: appenderList){
            appender.print(message);
        }
    }

}
