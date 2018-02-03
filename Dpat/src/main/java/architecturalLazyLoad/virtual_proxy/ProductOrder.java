package architecturalLazyLoad.virtual_proxy;

public abstract class ProductOrder {
	
	public Integer Id;
	protected Customer _customer;
	
	public abstract Customer getCustomer();
	
	public String printLabel(){
		return getCustomer().companyName;
	}
	
	public int hashCode(){
		return Id.hashCode();
	}

}
