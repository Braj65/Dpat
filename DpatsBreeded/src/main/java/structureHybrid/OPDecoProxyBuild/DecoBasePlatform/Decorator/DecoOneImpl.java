package structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Decorator;

import structureHybrid.OPDecoProxyBuild.BaseProduct.Product.ProductBase;

public class DecoOneImpl extends DecoratorPlatform{
	
	public DecoOneImpl(DecoratorType type){
		decoratorType=type;
	}

	public void execute() {
		System.out.println("Before execution first decorator");
		prodToBeDecorated.execute();		
	}

	@Override
	public ProductBase decorate(ProductBase prod) {
		prodToBeDecorated=prod;
		return this;
	}

}
