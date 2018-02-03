package creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.platformBuilder;

import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.Platform;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.PlatformType;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.platformFamily.factory.Factory;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily.Product;
import creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily.ProductType;

public class PlatformBuilder implements Platform{
	private String platName, platVal;
	private PlatformType platType;
	protected Product targetProd;
	
	public PlatformBuilder setPlatName(String name){
		this.platName=name;
		return this;
	}
	
	public PlatformBuilder setPlatVal(String val){
		this.platVal=val;
		return this;
	}
	
	public PlatformBuilder setPlatType(PlatformType type){
		this.platType=type;
		return this;
	}
	
	public PlatformBuilder setProd(Product prod){
		this.targetProd=prod;
		return this;
	}
	
	public PlatformType getType(){
		return platType;
	}
	
	public Platform build(){
		return Factory.createPlatform(this);
	}

	public void delegateExecuteProd() {}

	public void updatePlatform(PlatformBuilder builder) {
			this.platName=builder.platName;
			this.platVal=builder.platVal;
			this.platType=builder.platType;
			this.targetProd=builder.targetProd;
	}
}
