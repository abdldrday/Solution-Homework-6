package chain_of_responsibility;

public interface SupportHandler {
    void setNext(SupportHandler handler);
    void handle(String issue);
}

abstract class AbstractSupportHanler implements SupportHandler {
    protected SupportHandler nextHandler;

    public void setNext(SupportHandler handler){
        this.nextHandler = handler;
    }

    public abstract void handle(String issue);
}
