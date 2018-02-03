package creationHybrids.factoryObjectPoolBuilder.FOProdFamily;

import creationHybrids.factoryObjectPoolBuilder.FOFactory.Factory;
import creationHybrids.factoryObjectPoolBuilder.FOObjectPool.ObjectPool;

public class ProductBuilder {
	
	public String productId, productVal;
	private ProductType prodType;
	
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
	
	public ProductType getProdType(){
		return this.prodType;
	}
	
	public Product updateProd(ProductBuilder prod){
		prod.prodType=this.prodType;
		prod.productId=this.productId;
		prod.productVal=this.productVal;
		return (Product)prod;
	}
	
	public <T> Product build(ObjectPool<T> pool){
		return Factory.createProduct(pool, this);
	}
	
	
}
