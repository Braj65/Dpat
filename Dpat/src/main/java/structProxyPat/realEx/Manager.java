package structProxyPat.realEx;


public class Manager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProxyOrderRepository prox=new ProxyOrderRepository();
		Order o=prox.getOrder(1);
		
		System.out.println("Order id 1"+ o.orderId);
		System.out.println("Order date"+ o.cust.cutomerID);

	}

}
