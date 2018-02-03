package behaveDependencyInjectionPat.guiceDIsingleton;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class AppInjector extends AbstractModule{

	@Override
	protected void configure() {
		bind(CCProcessorService.class).to(CCProcessorServiceimpl.class).in(Singleton.class);		
	}

}
