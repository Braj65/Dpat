package behaveDependencyInjectionPat.realEx;

public class Client {
	public static void main(String[] args){
		String msg="Hi";
		String email="Jammy";
		
		MsgServiceInjector injector=null;
		ServiceConsumer consumer=null;
		
		//send mail
		injector=new MsgServiceInjectorImpl();
		consumer=injector.getConsumer();
		consumer.processMsgs(msg, email);
		
	}
}
