package Task1;

public class EMailMessage implements IMessage {
    @Override
    public void sendMassage(String typeMessage, String message) {

        if (typeMessage.equals("e.mail")) {
            //e.mail
            //use java mail sender API
        }
    }
}

public class SMSMessage implements IMessage {
    @Override
    public void sendMassage(String typeMessage, String message) {
        if (typeMessage.equals("SMS")) {
            //SMS
            //use java mail sender API
        }
    }
}
