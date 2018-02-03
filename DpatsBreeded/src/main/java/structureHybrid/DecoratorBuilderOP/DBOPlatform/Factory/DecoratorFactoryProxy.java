package structureHybrid.DecoratorBuilderOP.DBOPlatform.Factory;

public class DecoratorFactoryProxy {
	public DecoratorFactory factory;
	
	public DecoratorFactory getFactory(){
		if(factory==null)
			factory= new DecoratorFactory();
		return factory;
	}
}
