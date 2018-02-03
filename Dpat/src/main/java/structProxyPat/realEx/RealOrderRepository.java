package structProxyPat.realEx;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class RealOrderRepository extends OrderRepositoryBase{

	private List<Order> _orders=new ArrayList<Order>();
	private List<OrderDetail> _orderDetail=new ArrayList<OrderDetail>();
	private List<Customer> _customers=new ArrayList<Customer>();
	
	private Hashtable<Integer, Integer> _orderCust=new Hashtable<Integer, Integer>();
	
	public RealOrderRepository(){
		Order o1=new Order();
		Order o2=new Order();
		o1.orderId=1;o2.orderId=2;
		_orders.add(o1);
		_orders.add(o2);
		
		OrderDetail od1=new OrderDetail();
		OrderDetail od2=new OrderDetail();
		od1.orderDate=10;od2.orderDate=11;
		_orderDetail.add(od1);
		_orderDetail.add(od2);
		
		Customer c1=new Customer();
		Customer c2=new Customer();
		c1.cutomerID=22;c2.cutomerID=23;
		_customers.add(c1);
		_customers.add(c2);
		
		_orderCust.put(1, 1);
		_orderCust.put(2, 2);		
	}
	
	@Override
	public Order getOrder(int id) {
		for(Order o:_orders){
			if(o.orderId==id)
				return o;
			else
				return null;
		}
		return null;
	}

	@Override
	public OrderDetail getOrderDetail(int orderId) {
		for(OrderDetail o:_orderDetail){
			if(o.orderDate==orderId)
				return o;
			else
				return null;						
		}
		return null;
	}

	@Override
	public Customer getOrderCustomer(int orderId) {
		int cusId=_orderCust.get(orderId);
		for(Customer c:_customers){
			if(c.cutomerID==cusId)
				return c;
			else
				return null;
		}
		return null;
	}

}
