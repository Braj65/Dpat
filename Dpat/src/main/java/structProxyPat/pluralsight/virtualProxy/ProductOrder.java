package structProxyPat.pluralsight.virtualProxy;

public class ProductOrder {
	
	public Customer _customer;
	public Integer id;
	
	public Customer getCustomer(){
		return new Customer();
	}

}
