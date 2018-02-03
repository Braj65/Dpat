package structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight;

import structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyFactory.BBFFactory;

public class ProdBuilderFlyWeight implements ProdFlyWeight{
	protected String speed;
	protected ProductType prodType;
	public void extrinsicMeth(){}
	
	public ProdBuilderFlyWeight setSpeed(String speed){
		this.speed=speed;
		return this;
	}
	
	public ProdBuilderFlyWeight setType(ProductType type){
		this.prodType=type;
		return this;
	}
	
	public ProductType getType(){
		return this.prodType;
	}
	
	public ProdFlyWeight build(){
		return BBFFactory.createProduct(this);
	}
	
	public ProdFlyWeight upgrade(ProdBuilderFlyWeight prod){
		prod.prodType=this.prodType;
		prod.speed=this.speed;
		return prod;
	}

}
