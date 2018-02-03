package behaveDependencyInjectionPat.realEx;

public class ServiceConsumerImpl implements ServiceConsumer{

	private MsgService service;
	public ServiceConsumerImpl(MsgService srv) {
		this.service=srv;
	}
	
	@Override
	public void processMsgs(String msg, String rec) {
		this.service.sendMsg(msg, rec);
	}

}
