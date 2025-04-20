package chain_of_responsibility;

public class JuniorSupportHandler extends AbstractSupportHanler{
    public void handle(String issue){
        if(issue.equals("refund_request") || issue.equals("billing_issue")){
            System.out.println("[JunoirSupport] Handled " + issue);
        } else if (nextHandler != null){
            nextHandler.handle(issue);
        } else {
            System.out.println("[JuniourSupport] can't handle" + issue);
        }
    }
}
