package structureHybrid.DecoratorBuilderOP.DBOPlatform.Decorator;

import structureHybrid.DecoratorBuilderOP.BaseProduct.Product.Product;

public class DecoTwoImpl extends DecoratorPlatform{
	
	public DecoTwoImpl(DecoratorType type){
		decoType=type;
	}

	public void execute() {
		System.out.println("Before execution second decorator");
		prodToBeDecorated.execute();		
	}
	
	@Override
	public Product decorate(Product prod) {
		prodToBeDecorated=prod;
		return this;
	}
}
