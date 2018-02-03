package structureHybrid.OPDecoProxyBuild.BaseProduct;

import structureHybrid.OPDecoProxyBuild.ProxyPlatform.IValueHolder;

public class ProductProxy<T> {
	public T pool;
	public IValueHolder<T> loader;
	
	public ProductProxy(IValueHolder<T> loader){
		this.loader=loader;
	}
	
	public T getValue(){
		if(pool==null){
			pool=loader.load();
		}
		return pool;
	}
}