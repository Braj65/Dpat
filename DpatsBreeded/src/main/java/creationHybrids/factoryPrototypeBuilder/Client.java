package creationHybrids.factoryPrototypeBuilder;

import creationHybrids.factoryPrototypeBuilder.FPProdFamily.Product;
import creationHybrids.factoryPrototypeBuilder.FPProdFamily.ProductBuilder;
import creationHybrids.factoryPrototypeBuilder.FPProdFamily.ProductOneImpl;
import creationHybrids.factoryPrototypeBuilder.FPProdFamily.ProductTwoImpl;
import creationHybrids.factoryPrototypeBuilder.FPProdFamily.ProductType;

public class Client {
	
	public static void main(String[] args) {
		Product prod=new ProductOneImpl();
		Product nuprod=new ProductBuilder().setProdId("1").setProdVal("One")
				.setProdType(ProductType.TYPEONE).build(prod);
		nuprod.execute();
		prod=new ProductTwoImpl();
		nuprod=new ProductBuilder().setProdId("1").setProdVal("One")
				.setProdType(ProductType.TYPEONE).build(prod);
		nuprod.execute();
		
	}

}
