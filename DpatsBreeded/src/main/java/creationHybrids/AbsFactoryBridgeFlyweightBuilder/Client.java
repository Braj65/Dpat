package creationHybrids.AbsFactoryBridgeFlyweightBuilder;

import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.Platform;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.PlatformType;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.platformBuilder.PlatformBuilder;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily.Product;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily.ProductBuilder;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily.ProductType;

public class Client {
	
	public static void main(String[] args) {
		Product product=new ProductBuilder().setProdId("11").setProdName("one")
				.setProdType(ProductType.TYPEONE).setProdVal("oneval").build();
		Platform plat=new PlatformBuilder().setPlatName("plat1").setPlatVal("oneval")
				.setPlatType(PlatformType.PLATA).setProd(product).build();
		plat.delegateExecuteProd();
		
	}

}
