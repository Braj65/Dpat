package creationHybrids.factoryFlyweightBuilder.Factory;

import java.util.HashMap;
import java.util.Map;

import creationHybrids.factoryFlyweightBuilder.ProductFamily.Product;
import creationHybrids.factoryFlyweightBuilder.ProductFamily.ProductBuilder;
import creationHybrids.factoryFlyweightBuilder.ProductFamily.ProductOneImpl;
import creationHybrids.factoryFlyweightBuilder.ProductFamily.ProductTwoImpl;
import creationHybrids.factoryFlyweightBuilder.ProductFamily.ProductType;

public class Factory {
	
	private static final Map<ProductType, Product> flyWeights=new HashMap<ProductType, Product>();
	
	public static Product createProduct(ProductBuilder builder){
		ProductType type=builder.getType();
		Product modifyProd;
		if(flyWeights.containsKey(type)){
			modifyProd=flyWeights.get(type);
			modifyProd.updateProduct(builder);
			return flyWeights.get(type);
		}
		
		if(type.equals(ProductType.TYPEONE)){
			flyWeights.put(type, ProductOneImpl.createProduct(builder));
			return flyWeights.get(type);
		}
		else if(type.equals(ProductType.TYPETWO)){
			flyWeights.put(type, ProductTwoImpl.createProduct(builder));
			return flyWeights.get(type);
		}
		else
			return null;
	}
	
	public static Product getProduct(ProductType type){
		if(flyWeights.containsKey(type)){
			return flyWeights.get(type);
		}else{
			if(type.equals(ProductType.TYPEONE)){
				flyWeights.put(type, ProductOneImpl.createProduct().prodType(type));
				return flyWeights.get(type);
			}else if(type.equals(ProductType.TYPEONE)){
				flyWeights.put(type, ProductTwoImpl.createProduct().prodType(type));
				return flyWeights.get(type);
			}else
				return null;
		}
	}

}
