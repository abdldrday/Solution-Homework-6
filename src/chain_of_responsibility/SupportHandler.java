package chain_of_responsibility;

public interface SupportHandler {
    void setNext(SupportHandler handler);
    void handle(String issue);
}


