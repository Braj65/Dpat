package architecturalLazyLoad.valueholder;

import java.util.ArrayList;
import java.util.List;

public class OrderItemLoader implements IValueLoader<List<OrderItem>>{
	private int _orderId;
	
	public OrderItemLoader(int orderId){
		_orderId=orderId;
	}
	
	public List<OrderItem> Load(){
		//fetch items from DB by orderid
		System.out.println("Fetchng items from DB");
		return new ArrayList<OrderItem>();
	}
}
