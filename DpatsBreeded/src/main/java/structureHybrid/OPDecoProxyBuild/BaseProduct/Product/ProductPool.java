package structureHybrid.OPDecoProxyBuild.BaseProduct.Product;

import structureHybrid.OPDecoProxyBuild.OPool.ObjectPool;

public class ProductPool extends ObjectPool<ProductBuilder>{
	
	public ProductPool(){
		checkin(new ProdOneImpl());
		checkin(new ProdTwoImpl());
	}

	@Override
	public ProductBuilder create() {
		return null;
	}

	@Override
	public boolean validate(ProductBuilder t) {
		return true;
	}

	@Override
	public void expire(ProductBuilder t) {
		// TODO Auto-generated method stub
		
	}

}
