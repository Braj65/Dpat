package structBridgePat.realEx;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	public static void main(String[] args){
		List<Message> msg=new ArrayList<Message>();
		Message msg1=new Message();
		msg1.title="Hello world";
		msg1.body="full";
		msg1.importance=1;
		msg.add(msg1);
		
		UserEditedMessage msg2=new UserEditedMessage(new WebServiceSender());
		msg2.title="Hello world";
		msg2.body="full";
		msg2.importance=1;
		msg2.UserComments="Comments";
		msg.add(msg2);
		
		for(Message m:msg){
			m.send();
		}
		
	}

}
