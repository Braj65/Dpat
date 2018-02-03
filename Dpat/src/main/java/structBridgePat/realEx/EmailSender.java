package structBridgePat.realEx;

public class EmailSender extends MessageSenderBase{

	@Override
	public void SendMessage(String title, String body, int importance) {
		System.out.println("EmailSender");		
	}

}
