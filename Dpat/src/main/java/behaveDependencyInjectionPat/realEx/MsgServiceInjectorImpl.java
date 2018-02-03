package behaveDependencyInjectionPat.realEx;

public class MsgServiceInjectorImpl implements MsgServiceInjector{

	@Override
	public ServiceConsumer getConsumer() {
		return new ServiceConsumerImpl(new MsgServiceImpl());
	}

}
