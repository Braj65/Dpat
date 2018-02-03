package creationHybrids.factoryObjectPoolBuilder.FOProdFamily;

public class ProductOneImpl extends ProductBuilder implements Product{
	private final String PRODNAME="Type One";
	public void close() {
		// TODO Auto-generated method stub
		
	}

	public boolean isClosed() {
		// TODO Auto-generated method stub
		return false;
	}

	public void expire() {
		// TODO Auto-generated method stub
		
	}

	public ProductType getType() {
		return ProductType.TYPEONE;
	}

	public void execute() {
		System.out.println(PRODNAME);	
	}
}
