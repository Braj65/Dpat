package structureHybrid.DecoratorBuilderOP;

import structureHybrid.DecoratorBuilderOP.BaseProduct.BaseProdFactory;
import structureHybrid.DecoratorBuilderOP.BaseProduct.Product.Product;
import structureHybrid.DecoratorBuilderOP.BaseProduct.Product.ProductBuilder;
import structureHybrid.DecoratorBuilderOP.BaseProduct.Product.ProductPool;
import structureHybrid.DecoratorBuilderOP.BaseProduct.Product.ProductType;
import structureHybrid.DecoratorBuilderOP.DBOPlatform.Decorator.DecoratorPlatform;
import structureHybrid.DecoratorBuilderOP.DBOPlatform.Decorator.DecoratorType;
import structureHybrid.DecoratorBuilderOP.DBOPlatform.Factory.DecoratorFactoryProxy;
import structureHybrid.DecoratorBuilderOP.OPool.ObjectPool;

public class Client {
	
	public static void main(String[] args) {
		ObjectPool<ProductBuilder> pool=new ProductPool();
		Product prod=BaseProdFactory.getBaseProd(pool).setId("One").setVal("11")
				.setType(ProductType.TYPEONE);
		DecoratorFactoryProxy decoProxy=new DecoratorFactoryProxy();
		DecoratorPlatform decorator=decoProxy.getFactory().getDecorator(DecoratorType.DECOONE);
		prod=decorator.decorate(prod);
		decorator=decoProxy.getFactory().getDecorator(DecoratorType.DECOTWO);
		prod=decorator.decorate(prod);
		prod.execute();
	}

}
