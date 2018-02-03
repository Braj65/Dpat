package structureHybrid.DecoratorBuilderOP.DBOPlatform.Decorator;

import structureHybrid.DecoratorBuilderOP.BaseProduct.Product.Product;

public abstract class DecoratorPlatform implements Product{
	public Product prodToBeDecorated;
	public DecoratorType decoType;
	
	public abstract Product decorate(Product prod);
	
	public DecoratorPlatform(){
		
	}
}
