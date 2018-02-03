package structureHybrid.BridgeBuilderFlyweight.Platform.BBFPlatform;

import structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight.ProdFlyWeight;

public class PlatformFast extends Platform{

	public PlatformFast(ProdFlyWeight prod) {
		super(prod);
	}

	@Override
	public void execute() {
		product.extrinsicMeth();
	}

}
