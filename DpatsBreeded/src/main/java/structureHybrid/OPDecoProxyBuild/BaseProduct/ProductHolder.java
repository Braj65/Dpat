package structureHybrid.OPDecoProxyBuild.BaseProduct;

import structureHybrid.OPDecoProxyBuild.BaseProduct.Product.ProductBuilder;
import structureHybrid.OPDecoProxyBuild.BaseProduct.Product.ProductPool;
import structureHybrid.OPDecoProxyBuild.OPool.ObjectPool;
import structureHybrid.OPDecoProxyBuild.ProxyPlatform.IValueHolder;

public class ProductHolder implements IValueHolder<ObjectPool<ProductBuilder>>{

	public ObjectPool<ProductBuilder> load() {
		return new ProductPool();
	}

}
