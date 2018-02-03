package creationHybrids.factoryFlyweightBuilder.ProductFamily;

import creationHybrids.factoryFlyweightBuilder.Factory.Factory;

public class ProductBuilder implements Product{
	protected String productName;
	protected String productId;
	protected String productVal;
	protected ProductType prodType;
	
	public ProductBuilder prodName(String name){
		productName=name;
		return this;
	}
	
	public ProductBuilder prodId(String id){
		productId=id;
		return this;
	}
	
	public ProductBuilder prodVal(String val){
		productVal=val;
		return this;
	}
	
	public ProductBuilder prodType(ProductType type){
		prodType=type;
		return this;
	}
	
	public ProductType getType(){
		return prodType;
	}
	
	public String getProdName(){
		return productName;
	}
	public String getProdId(){
		return productId;
	}
	public String getProdVal(){
		return productVal;
	}
	
	public Product build(){
		return Factory.createProduct(this);
	}
	
	public static Product getProduct(ProductType type){
		return Factory.getProduct(type);
	}
		
	public void useProduct(){}
	
	public void updateProduct(ProductBuilder builder){
		this.productName=builder.getProdName();
		this.productId=builder.getProdId();
		this.productVal=builder.getProdVal();
		this.prodType=builder.getType();
	}
	
}


