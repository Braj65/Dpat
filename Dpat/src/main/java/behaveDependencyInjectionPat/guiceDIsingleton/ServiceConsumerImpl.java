package behaveDependencyInjectionPat.guiceDIsingleton;

import com.google.inject.Inject;

public class ServiceConsumerImpl implements ServiceConsumer{

	private CCProcessorService service;
	
	@Inject
	public ServiceConsumerImpl(CCProcessorService srv){
		this.service=srv;		
	}
	
	/*@Inject
	public void setService(CCProcessorService srv){
		this.service=srv;
	}*/
	
	@Override
	public String processJam() {
		return this.service.jam();
	}

	@Override
	public String processJammer() {
		return this.service.jammer();
	}

}
