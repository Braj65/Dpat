package structureHybrid.OPDecoProxyBuild.BaseProduct.Product;

public abstract class ProductBuilder implements ProductBase{
	
	private String prodId, prodVal;
	protected ProductType prodType;
	
	public ProductBuilder setProdId(String id){
		this.prodId=id;
		return this;
	}
	
	public ProductBuilder setProdVal(String val){
		this.prodVal=val;
		return this;
	}
	
	public ProductBuilder setType(ProductType type){
		this.prodType=type;
		return this;
	}
}
