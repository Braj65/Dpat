package behaveDependencyInjectionPat.guiceDIsingleton;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Client {
	public static void main(String[] args){
		Injector injector=Guice.createInjector(new AppInjector());
		ServiceConsumerImpl cons=injector.getInstance(ServiceConsumerImpl.class);
		System.out.println(cons.processJam());
		System.out.println(cons.processJammer());
		ServiceConsumerImpl cons2=injector.getInstance(ServiceConsumerImpl.class);
		System.out.println(cons.processJammer());
	}
}
