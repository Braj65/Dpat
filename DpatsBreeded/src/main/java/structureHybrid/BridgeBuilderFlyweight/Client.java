package structureHybrid.BridgeBuilderFlyweight;

import structureHybrid.BridgeBuilderFlyweight.Platform.BBFPlatform.Platform;
import structureHybrid.BridgeBuilderFlyweight.Platform.BBFPlatform.PlatformFast;
import structureHybrid.BridgeBuilderFlyweight.Platform.BBFPlatform.PlatformSlow;
import structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight.ProdBuilderFlyWeight;
import structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight.ProdFlyWeight;
import structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight.ProductType;

public class Client {
	
	public static void main(String[] args) {
		ProdFlyWeight prod=new ProdBuilderFlyWeight().setSpeed("120")
				.setType(ProductType.TYPEONE).build();
		Platform platform=new PlatformFast(prod);
		platform.execute();
		
		prod=new ProdBuilderFlyWeight().setSpeed("230")
				.setType(ProductType.TYPETWO).build();
		platform=new PlatformSlow(prod);
		platform.execute();
		
		prod=new ProdBuilderFlyWeight().setSpeed("111")
				.setType(ProductType.TYPEONE).build();
		platform=new PlatformSlow(prod);
		platform.execute();
	}

}
