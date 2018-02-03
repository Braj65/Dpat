package architecturalLazyLoad.virtual_proxy;

public class Client {
	
	public static void main(String[] args) {
		Client c=new Client();
		c.printLabelWithProxy();
	}
	
	public void printLabelWithProxy(){
		Integer orderId=new Integer("123");
		ProductOrder order=new OrderFactory().createFromId(orderId);
		System.out.println(order.Id);
		String result=order.printLabel();
		System.out.println(result);
	}

}
