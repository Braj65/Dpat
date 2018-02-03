package creationHybrids.factoryObjectPoolBuilder.FOProdFamily.productPool;

import creationHybrids.factoryObjectPoolBuilder.FOObjectPool.ObjectPool;
import creationHybrids.factoryObjectPoolBuilder.FOProdFamily.Product;
import creationHybrids.factoryObjectPoolBuilder.FOProdFamily.ProductOneImpl;
import creationHybrids.factoryObjectPoolBuilder.FOProdFamily.ProductTwoImpl;
import creationHybrids.factoryObjectPoolBuilder.FOProdFamily.ProductType;

public class ProductPool extends ObjectPool<Product>{
	private ProductType type;
	private Product prod;
	
	public void setType(ProductType type){
		this.type=type;
		Product prod=type.create();
		checkin(prod);
	}
	
	@Override
	public void expire(Product o) {
		o.close();		
	}

	@Override
	public boolean validate(Product o) {
		return o.getType().equals(type);
	}

	@Override
	public Product create() {
		if(type.equals(ProductType.TYPEONE))
			return new ProductOneImpl();
		else
			return new ProductTwoImpl();
	}
	
	public ProductPool setProductType(ProductType pubType){
		this.type=pubType;
		return this;
	}

}
