package creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily;

import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.platformBuilder.PlatformBuilder;

public class PlatformA extends PlatformBuilder{

	private PlatformA(PlatformBuilder builder) {
		super.updatePlatform(builder);
	}
	
	public static Platform createPlatform(PlatformBuilder builder){
		return new PlatformA(builder);
	}

	@Override
	public void delegateExecuteProd() {
		this.targetProd.runProduct();	
	}

}
