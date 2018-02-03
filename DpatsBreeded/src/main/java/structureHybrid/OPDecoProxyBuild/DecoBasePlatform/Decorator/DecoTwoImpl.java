package structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Decorator;

import structureHybrid.OPDecoProxyBuild.BaseProduct.Product.ProductBase;

public class DecoTwoImpl extends DecoratorPlatform{
	
	public DecoTwoImpl(DecoratorType type){
		decoratorType=type;
	}

	public void execute() {
		System.out.println("Before executing decorator two");
		prodToBeDecorated.execute();
	}

	@Override
	public ProductBase decorate(ProductBase prod) {
		prodToBeDecorated=prod;
		return this;
	}

}
