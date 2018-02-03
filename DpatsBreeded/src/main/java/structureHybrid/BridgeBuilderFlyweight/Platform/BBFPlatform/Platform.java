package structureHybrid.BridgeBuilderFlyweight.Platform.BBFPlatform;

import structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight.ProdFlyWeight;

public abstract class Platform {
	protected ProdFlyWeight product;
	
	public Platform(ProdFlyWeight prod){
		product=prod;
	}
	
	public abstract void execute();

}
