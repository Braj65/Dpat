package creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.factory;

import java.util.HashMap;
import java.util.Map;

import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.Platform;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.PlatformA;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.PlatformB;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.PlatformType;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.platformBuilder.PlatformBuilder;

public class Factory {
	private static Map<PlatformType, Platform> cache=new HashMap<PlatformType, Platform>();
	public static Platform createPlatform(PlatformBuilder builder){
		PlatformType type=builder.getType();
		Platform currPlat;
		if(cache.containsKey(type)){
			currPlat=cache.get(type);
			return currPlat;
		}
		
		if(type.equals(PlatformType.PLATA)){
			cache.put(type, PlatformA.createPlatform(builder));
			return cache.get(type);
		}else if(type.equals(PlatformType.PLATB)){
			cache.put(type, PlatformB.createPlatform(builder));
			return cache.get(type);
		}else
			return null;
	}

}
