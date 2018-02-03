package architecturalLazyLoad.lazy_initialization;

public class ProductOrder {
	
	private Customer _customer;
	
	public Customer getCustomer(){
		if(_customer==null)
			_customer=new Customer();//DB access happens here
		return _customer;
	}
	
	public String printLabel(){
		String result=getCustomer().companyName;
		return result;
	}

}
