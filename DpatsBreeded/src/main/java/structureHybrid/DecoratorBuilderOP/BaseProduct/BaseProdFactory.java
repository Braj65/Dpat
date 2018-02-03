package structureHybrid.DecoratorBuilderOP.BaseProduct;

import structureHybrid.DecoratorBuilderOP.BaseProduct.Product.Product;
import structureHybrid.DecoratorBuilderOP.BaseProduct.Product.ProductBuilder;
import structureHybrid.DecoratorBuilderOP.OPool.ObjectPool;

public class BaseProdFactory {
	
	public static ProductBuilder getBaseProd(ObjectPool<ProductBuilder> pool){
		return pool.checkout();
	}

}
