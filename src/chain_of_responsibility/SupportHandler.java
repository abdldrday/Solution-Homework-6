package chain_of_responsibility;

public interface SupportHandler {
    SupportHandler setNext(SupportHandler handler);
    void handle(String issue);
}

abstract class AbstractSupportHanler implements SupportHandler {
    protected SupportHandler nextHandler;

    public SupportHandler setNext(SupportHandler handler){
        this.nextHandler = handler;
        return handler;
    }

    public abstract void handle(String issue);
}
