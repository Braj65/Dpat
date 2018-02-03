package structBridgePat.realEx;

public class UserEditedMessage extends Message{
	
	public String UserComments;
	public UserEditedMessage(MessageSenderBase messageSender){
		this.messageSender=messageSender;
	}
	
	@Override
	public void send(){
		messageSender.SendMessage(title, body, importance);
	}

}
