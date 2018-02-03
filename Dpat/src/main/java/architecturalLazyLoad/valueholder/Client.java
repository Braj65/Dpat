package architecturalLazyLoad.valueholder;

public class Client {
	public static void main(String[] args) {
		
	}
	
	public void notLoadItemsUntilReferenced(){
		int orderId=123;
		OrderVH order=new OrderFactory().createFromId(orderId);
		System.out.println(order.Id);
		
		System.out.println(order._items);
	}

}
