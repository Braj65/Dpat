package creationHybrids.factoryObjectPoolBuilder.FOFactory;

import creationHybrids.factoryObjectPoolBuilder.FOObjectPool.ObjectPool;
import creationHybrids.factoryObjectPoolBuilder.FOProdFamily.Product;
import creationHybrids.factoryObjectPoolBuilder.FOProdFamily.ProductBuilder;

public class Factory {
	
	public static <T> Product createProduct(ObjectPool<T> pool, ProductBuilder builder){
		Product prod=(Product) pool.checkout();
		return builder.updateProd((ProductBuilder) prod);		
	}
}
