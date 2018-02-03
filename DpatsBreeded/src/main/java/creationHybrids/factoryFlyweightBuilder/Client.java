package creationHybrids.factoryFlyweightBuilder;

import creationHybrids.factoryFlyweightBuilder.Factory.Factory;
import creationHybrids.factoryFlyweightBuilder.ProductFamily.Product;
import creationHybrids.factoryFlyweightBuilder.ProductFamily.ProductBuilder;
import creationHybrids.factoryFlyweightBuilder.ProductFamily.ProductType;

public class Client {
	public static void main(String[] args) {
		//***********Second approach
		Product productnxt=((ProductBuilder)ProductBuilder.getProduct(ProductType.TYPEONE)).prodId("11").prodName("a1")
				.prodVal("11");
		productnxt.useProduct();
		System.out.println();
		
		//*********First approach
		Product product=new ProductBuilder().prodName("oneName")
				.prodId("p1").prodVal("111").prodType(ProductType.TYPEONE).build();
		product.useProduct();
		product=new ProductBuilder().prodName("pname")
				.prodId("p1").prodType(ProductType.TYPEONE).build();	
		product.useProduct();
		product=new ProductBuilder().prodName("p2name")
				.prodId("p2").prodVal("333").prodType(ProductType.TYPETWO).build();
		product.useProduct();	
	}
}
