package creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily.factory;

import java.util.HashMap;
import java.util.Map;

import creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily.Product;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily.ProductBuilder;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily.ProductOneImpl;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily.ProductTwoImpl;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily.ProductType;


public class Factory {
	
	private static Map<ProductType, Product> prodCache=new HashMap<ProductType, Product>();
	
	public static Product createProduct(ProductBuilder builder){
		ProductType type=builder.getType();
		Product prod;
		if(prodCache.containsKey(type)){
			prod=prodCache.get(type);
			prod.updateProduct(builder);
			prodCache.put(type, prod);
		}
		
		if(type.equals(ProductType.TYPEONE)){
			prodCache.put(type, ProductOneImpl.createProduct(builder));
			return prodCache.get(type);
		}else if(type.equals(ProductType.TYPETWO)){
			prodCache.put(type, ProductTwoImpl.createProduct(builder));
			return prodCache.get(type);
		}else
			return null;
	}

}
