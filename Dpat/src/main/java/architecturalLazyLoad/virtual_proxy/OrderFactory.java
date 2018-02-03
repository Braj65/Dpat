package architecturalLazyLoad.virtual_proxy;

public class OrderFactory {
	
	public ProductOrder createFromId(int id){
		return new OrderProxy(id);
	}

}
