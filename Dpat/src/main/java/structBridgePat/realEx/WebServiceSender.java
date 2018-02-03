package structBridgePat.realEx;

public class WebServiceSender extends MessageSenderBase{

	@Override
	public void SendMessage(String title, String body, int importance) {
		System.out.println("WebServiceSender");		
	}

}
