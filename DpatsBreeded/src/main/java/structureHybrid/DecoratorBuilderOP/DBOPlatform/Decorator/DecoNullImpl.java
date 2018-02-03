package structureHybrid.DecoratorBuilderOP.DBOPlatform.Decorator;

import structureHybrid.DecoratorBuilderOP.BaseProduct.Product.Product;

public class DecoNullImpl extends DecoratorPlatform{
	
	public DecoNullImpl(){
		System.out.println("No decorator of such type exists");
	}

	public void execute() {
		
	}
	
	@Override
	public Product decorate(Product prod) {
		prodToBeDecorated=prod;
		return this;
	}
}
