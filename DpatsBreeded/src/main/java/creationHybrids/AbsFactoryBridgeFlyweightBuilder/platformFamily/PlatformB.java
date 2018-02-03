package creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily;

import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.platformBuilder.PlatformBuilder;


public class PlatformB extends PlatformBuilder{

	public PlatformB(PlatformBuilder builder) {
		super.updatePlatform(builder);
	}
	
	public static Platform createPlatform(PlatformBuilder builder){
		return new PlatformB(builder);
	}

	@Override
	public void delegateExecuteProd() {
		this.targetProd.runProduct();
	}

}
