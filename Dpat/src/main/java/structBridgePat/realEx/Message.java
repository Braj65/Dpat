package structBridgePat.realEx;

public class Message {
	public MessageSenderBase messageSender;
	public String title;
	public String body;
	public int importance;
	
	public Message(){
		messageSender=new EmailSender();
	}
	
	public void send(){
		messageSender.SendMessage(title, body, importance);
	}

}
