package structureHybrid.OPDecoProxyBuild.BaseProduct;

import structureHybrid.OPDecoProxyBuild.BaseProduct.Product.ProductBase;
import structureHybrid.OPDecoProxyBuild.BaseProduct.Product.ProductBuilder;
import structureHybrid.OPDecoProxyBuild.OPool.ObjectPool;

public class ProductFactory {
	
	public static ProductProxy getProdProxy(){
//		ProductVH vh=new ProductVH();
//		vh.setPool(new ProductProxy<ObjectPool<ProductBuilder>>(new ProductHolder()));
		
		ProductProxy<ObjectPool<ProductBuilder>> prox=
				new ProductProxy<ObjectPool<ProductBuilder>>(new ProductHolder());
		return prox;
	}

}
