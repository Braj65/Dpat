package architecturalLazyLoad.lazy_initialization;

public class Client {
	public static void main(String[] args) {
		Client c=new Client();
		c.printLabelWithBadOrder();
	}
	
	public void printLabelWithBadOrder(){
		ProductOrder order=new ProductOrder();
		System.out.println(order.printLabel());
	}

}
