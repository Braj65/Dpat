package structureHybrid.BridgeBuilderFlyweight.Platform.BBFPlatform;

import structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight.ProdFlyWeight;

public class PlatformSlow extends Platform{
	

	public PlatformSlow(ProdFlyWeight prod) {
		super(prod);
	}

	@Override
	public void execute() {
		product.extrinsicMeth();	
	}

}
