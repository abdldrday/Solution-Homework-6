package chain_of_responsibility;

public class FAQBotHandler extends AbstractSupportHanler{
    public void handle(String issue){
        if(issue.equals("password_reset")){
            System.out.println("[FAQBot] Handle " + issue);
        } else if (nextHandler != null) {
            nextHandler.handle(issue);
        }
    }
}
