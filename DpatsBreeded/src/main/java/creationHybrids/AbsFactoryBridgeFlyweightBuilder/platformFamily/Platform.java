package creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily;

import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.platformBuilder.PlatformBuilder;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily.Product;

public interface Platform {		
	void delegateExecuteProd();
	void updatePlatform(PlatformBuilder builder);	
}
