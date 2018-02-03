package structProxyPat.pluralsight.virtualProxy;

public class OrderFactory {
	
	public static OrderProxy createOrder(int id){
		return new OrderProxy(id);
	}

}
