package structProxyPat.realEx;

public class ProxyOrderRepository extends OrderRepositoryBase{
	
	public RealOrderRepository real;
	
	public ProxyOrderRepository(){
		real=new RealOrderRepository();
		
	}
	
	public Order getOrder(int id){
		Order o1=real.getOrder(id);
		o1.cust=getOrderCustomer(o1.orderId);
		return o1;
	}
	public OrderDetail getOrderDetail(int orderId){
		return real.getOrderDetail(orderId);
	}
	
	public Customer getOrderCustomer(int orderId){
		return real.getOrderCustomer(orderId);
	}
	

}
