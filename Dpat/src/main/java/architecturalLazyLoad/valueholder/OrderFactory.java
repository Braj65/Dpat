package architecturalLazyLoad.valueholder;

import java.util.List;

public class OrderFactory {
	
	public OrderVH createFromId(int id){
		OrderVH order=new OrderVH(id);
		order.setItems(new ValueHolder_Proxy<List<OrderItem>>(new OrderItemLoader(id)));
		return order;
	}

}
