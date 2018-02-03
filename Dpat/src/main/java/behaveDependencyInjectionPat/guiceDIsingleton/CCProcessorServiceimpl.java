package behaveDependencyInjectionPat.guiceDIsingleton;

//@Singleton
public class CCProcessorServiceimpl implements CCProcessorService{

	private String param=null;
	@Override
	public String jam() {
		param="perpetrator";
		return param;
	}
	
	@Override
	public String jammer() {
		return param;
	}
}
