package structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Decorator;

import structureHybrid.OPDecoProxyBuild.BaseProduct.Product.ProductBase;

public abstract class DecoratorPlatform implements ProductBase{
	public ProductBase prodToBeDecorated;
	public DecoratorType decoratorType;
	
	public abstract ProductBase decorate(ProductBase prod);
}
