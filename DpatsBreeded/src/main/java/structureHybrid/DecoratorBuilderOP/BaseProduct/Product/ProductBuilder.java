package structureHybrid.DecoratorBuilderOP.BaseProduct.Product;

public abstract class ProductBuilder implements Product{
	
	private String prodId, prodVal;
	protected ProductType prodType;
	
	public ProductBuilder setId(String id){
		this.prodId=id;
		return this;
	}
	
	public ProductBuilder setVal(String val){
		this.prodVal=val;
		return this;
	}
	
	public ProductBuilder setType(ProductType type){
		this.prodType=type;
		return this;
	}

}
