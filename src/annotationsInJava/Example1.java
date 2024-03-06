package annotationsInJava;
class MessageService{
    static String provider;
    String sender;
    String recipient;
    String message;
    MessageService(){
        System.out.println("Running message Service");
    }
    public String getRecipient(){
        return recipient;
    }
    public void setRecipient(String recipient){
        this.recipient=recipient;
    }
    public String getProvider(){
        return provider;
    }
    public void setProvider(String provider1){
        this.provider=provider1;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}



public class Example1 {
    public static void main(String[] args) {
        System.out.println(MessageService.provider);
        MessageService m = new MessageService();
    }

    }

