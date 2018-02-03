package structureHybrid.OPDecoProxyBuild;

import structureHybrid.OPDecoProxyBuild.BaseProduct.ProductFactory;
import structureHybrid.OPDecoProxyBuild.BaseProduct.ProductProxy;
import structureHybrid.OPDecoProxyBuild.BaseProduct.Product.ProductBase;
import structureHybrid.OPDecoProxyBuild.BaseProduct.Product.ProductBuilder;
import structureHybrid.OPDecoProxyBuild.BaseProduct.Product.ProductType;
import structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Decorator.DecoratorPlatform;
import structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Decorator.DecoratorType;
import structureHybrid.OPDecoProxyBuild.DecoBasePlatform.Factory.DecoratorFactory;
import structureHybrid.OPDecoProxyBuild.OPool.ObjectPool;

public class Client {
	public static void main(String[] args) {
		ProductProxy<ObjectPool<ProductBuilder>> prox=ProductFactory.getProdProxy();
		ObjectPool<ProductBuilder> pool=prox.getValue();
		ProductBase prod=pool.checkout().setProdId("11").setProdVal("One").setType(ProductType.PRODONE);
		
		DecoratorFactory decoFact=new DecoratorFactory();
		DecoratorPlatform decorator=decoFact.getDecorator(DecoratorType.DECOONE);
		prod=decorator.decorate(prod);
		decorator=decoFact.getDecorator(DecoratorType.DECOTWO);
		prod=decorator.decorate(prod);
		prod.execute();
		
		prod=pool.checkout().setProdId("22").setProdVal("two").setType(ProductType.PRODTWO);
		decorator=decoFact.getDecorator(DecoratorType.DECOONE);
		prod=decorator.decorate(prod);
		decorator=decoFact.getDecorator(DecoratorType.DECOTWO);
		prod=decorator.decorate(prod);
		prod.execute();
		
	}

}
