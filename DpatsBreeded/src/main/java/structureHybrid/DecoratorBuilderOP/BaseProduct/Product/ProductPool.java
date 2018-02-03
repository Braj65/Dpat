package structureHybrid.DecoratorBuilderOP.BaseProduct.Product;

import structureHybrid.DecoratorBuilderOP.OPool.ObjectPool;

public class ProductPool extends ObjectPool<ProductBuilder>{
	
	public ProductPool(){
		checkin(new ProdOneImpl());
		checkin(new ProdTwoImpl());
	}

	@Override
	public boolean validate(ProductBuilder t) {
		return true;
	}

	@Override
	public ProductBuilder create() {
		return null;
	}

	@Override
	public void expire(ProductBuilder t) {		
	}

}
