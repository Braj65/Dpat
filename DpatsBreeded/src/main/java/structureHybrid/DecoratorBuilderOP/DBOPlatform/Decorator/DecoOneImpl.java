package structureHybrid.DecoratorBuilderOP.DBOPlatform.Decorator;

import structureHybrid.DecoratorBuilderOP.BaseProduct.Product.Product;

public class DecoOneImpl extends DecoratorPlatform{

	public DecoOneImpl(DecoratorType type){
		this.decoType=type;
	}

	public void execute() {
		System.out.println("Before execution first decorator");
		prodToBeDecorated.execute();		
	}

	@Override
	public Product decorate(Product prod) {
		prodToBeDecorated=prod;
		return this;
	}

}
