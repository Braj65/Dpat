package creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily;

import creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily.factory.Factory;

public class ProductBuilder implements Product{
	private String productName, productVal, productId;
	private ProductType prodType;
	
	public ProductBuilder setProdName(String prodName){
		this.productName=prodName;
		return this;
	}
	
	public ProductBuilder setProdVal(String prodVal){
		this.productVal=prodVal;
		return this;
	}
	
	public ProductBuilder setProdId(String prodId){
		this.productId=prodId;
		return this;
	}
	
	public ProductBuilder setProdType(ProductType type){
		this.prodType=type;
		return this;
	}
	
	public ProductType getType(){
		return this.prodType;
	}
	
	public Product build(){
		return Factory.createProduct(this);
	}
	

	public void runProduct(){}

	public void updateProduct(ProductBuilder builder) {
		this.productName=builder.productName;
		this.productId=builder.productId;
		this.productVal=builder.productVal;
		this.prodType=builder.prodType;
	}	

}
