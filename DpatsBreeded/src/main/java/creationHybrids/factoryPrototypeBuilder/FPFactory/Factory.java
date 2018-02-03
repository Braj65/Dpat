package creationHybrids.factoryPrototypeBuilder.FPFactory;

import creationHybrids.factoryPrototypeBuilder.FPProdFamily.Product;
import creationHybrids.factoryPrototypeBuilder.FPProdFamily.ProductBuilder;

public class Factory {
	
	public static Product createClone(Product prodSample, ProductBuilder builder){
		Product prod= prodSample.makeCopy();
		builder.upgradeProduct((ProductBuilder) prod);
		return prod;
	}

}
