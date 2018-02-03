package structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyFactory;

import java.util.HashMap;
import java.util.Map;


import structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight.ProdBuilderFlyWeight;
import structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight.ProdFlyWeight;
import structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight.ProdOneImpl;
import structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight.ProdTwoImpl;
import structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight.ProductType;

public class BBFFactory {
	
	public static Map<ProductType, ProdFlyWeight> cache=new HashMap<ProductType, ProdFlyWeight>();
	
	public static ProdFlyWeight createProduct(ProdBuilderFlyWeight builder){
		ProductType prodType=builder.getType();
		ProdBuilderFlyWeight prod=null;
		if(cache.get(prodType)!=null)
			return cache.get(prodType);
		
		if(builder.getType().equals(ProductType.TYPEONE)){
			prod=ProdOneImpl.createProduct();
		}else if(builder.getType().equals(ProductType.TYPETWO)){
			prod=ProdTwoImpl.createProduct();
		}else
			return null;
		builder.upgrade(prod);
		cache.put(prodType, prod);
		return cache.get(prodType);
	}

}
