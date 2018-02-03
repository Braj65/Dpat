package structProxyPat.pluralsight.virtualProxy;

public class OrderProxy extends ProductOrder{
	
	public int _id;
	
	public OrderProxy(int id){
		this._id=id;
	}
	
	public Customer getValue(){
		if(super._customer==null)
			return super.getCustomer();
		return super._customer;
	}
}
