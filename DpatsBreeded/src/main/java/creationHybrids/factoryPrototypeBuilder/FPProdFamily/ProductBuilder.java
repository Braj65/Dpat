package creationHybrids.factoryPrototypeBuilder.FPProdFamily;

import creationHybrids.factoryPrototypeBuilder.FPFactory.Factory;

public class ProductBuilder {
	protected String productVal, productId;
	protected ProductType prodType;
	
	public ProductBuilder setProdVal(String val){
		this.productVal=val;
		return this;
	}
	
	public ProductBuilder setProdId(String Id){
		this.productId=Id;
		return this;
	}
	
	public ProductBuilder setProdType(ProductType type){
		this.prodType=type;
		return this;
	}
	
	public Product build(Product sample){
		return Factory.createClone(sample, this);
	}
	
	public Product upgradeProduct(ProductBuilder prod){
		prod.prodType=this.prodType;
		prod.productId=this.productId;
		prod.productVal=this.productVal;
		return (Product) prod;
	}

}
