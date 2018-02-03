package structProxyPat.realEx;

public abstract class OrderRepositoryBase {
	
	public abstract Order getOrder(int id);
	
	public abstract OrderDetail getOrderDetail(int orderId);
	
	public abstract Customer getOrderCustomer(int orderId);
}
