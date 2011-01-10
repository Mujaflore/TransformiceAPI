package ee.ignorance.transformiceapi.protocol.server;

import java.util.List;


public class NormalChatResponse extends AbstractResponse{

    private String sender;
    private String message;

    public NormalChatResponse(List<String> rawMessage) {
        super(rawMessage);
    }

    @Override
    public void parse(List<String> rawMessage) {
        setSender(rawMessage.get(2));
        setMessage(rawMessage.get(3));
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getSender(){
        return sender;
    }

    public String getMessage(){
        return message;
    }
}