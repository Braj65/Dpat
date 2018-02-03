package structProxyPat.pluralsight.virtualProxy;

public class Client {
	
	public static void main(String[] args) {
		ProductOrder order=OrderFactory.createOrder(12);
		System.out.println(order.id);
		System.out.println(order.getCustomer());
	}

}
