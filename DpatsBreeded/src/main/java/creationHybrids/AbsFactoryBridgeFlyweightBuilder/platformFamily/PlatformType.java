package creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily;

public enum PlatformType {
	PLATA, PLATB;
	
	public String toString(){
		switch(this){
		case PLATA:
			return "PlatformA";
		case PLATB:
			return "PlatformB";
			default:
				return "";
		}
	}
}
