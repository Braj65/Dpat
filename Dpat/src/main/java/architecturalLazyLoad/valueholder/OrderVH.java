package architecturalLazyLoad.valueholder;

import java.util.List;

public class OrderVH {
	
	public Integer Id;
	public ValueHolder_Proxy<List<OrderItem>> _items;
	
	public OrderVH(Integer id){
		this.Id=id;
	}
	
	public List<OrderItem> getItems(){
		return _items.getValue();
	}
	
	public void setItems(ValueHolder_Proxy<List<OrderItem>> valueHolder){
		_items=valueHolder;
	}

}
