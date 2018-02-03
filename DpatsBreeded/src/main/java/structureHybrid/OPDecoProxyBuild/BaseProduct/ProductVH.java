package structureHybrid.OPDecoProxyBuild.BaseProduct;

import structureHybrid.OPDecoProxyBuild.BaseProduct.Product.ProductBuilder;
import structureHybrid.OPDecoProxyBuild.OPool.ObjectPool;

public class ProductVH {
	
	public ProductProxy<ObjectPool<ProductBuilder>> proxy;
	
	public void setPool(ProductProxy<ObjectPool<ProductBuilder>> proxy){
		this.proxy=proxy;
	}
	
	public ObjectPool<ProductBuilder> getPool(){
		return proxy.getValue();
	}

}
