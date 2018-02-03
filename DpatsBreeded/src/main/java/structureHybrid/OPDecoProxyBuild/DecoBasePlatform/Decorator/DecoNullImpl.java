package structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Decorator;

import structureHybrid.OPDecoProxyBuild.BaseProduct.Product.ProductBase;

public class DecoNullImpl extends DecoratorPlatform{
	
	public DecoNullImpl(){
		System.out.println("No decorator of such type exists");
	}

	public void execute() {
		System.out.println("It is a null decorator");
		
	}

	@Override
	public ProductBase decorate(ProductBase prod) {
		prodToBeDecorated=prod;
		return this;
	}

}
