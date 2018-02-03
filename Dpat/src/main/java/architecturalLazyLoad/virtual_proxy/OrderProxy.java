package architecturalLazyLoad.virtual_proxy;

public class OrderProxy extends ProductOrder{
	
	public OrderProxy(int inId){
		this.Id=inId;
	}
	
	public Customer getCustomer(){
		if(super._customer==null){
			super._customer=new Customer();
		}
		return super._customer;
	}
	
	public void setCustomer(Customer value){
		super._customer=value;
	}
	
	public boolean equals(Object obj){
		ProductOrder inOrder=(ProductOrder) obj;
		if(inOrder==null)
			return false;
		return inOrder.Id==this.Id;
	}
	
	public int hashCode(){
		return super.hashCode();
	}
}
