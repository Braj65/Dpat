package creationAbsFactoryPat.absFactory;

public class Application {
	public static void main(String[] args){
		String countryCode="EU";
		Customer customer=new Customer();
		Order order=new Order();
		OrderProcessor orderProcessor=null;
		FinancialToolsFactory factory=null;
		if(countryCode=="EU"){
			factory=new EuropeFinancialToolsFactory();
		}
		else if(countryCode=="CA"){
			factory=new CanadaFinancialToolsFactory();
		}
		orderProcessor=new OrderProcessor(factory);
		orderProcessor.processOrder(order);
	}

}
