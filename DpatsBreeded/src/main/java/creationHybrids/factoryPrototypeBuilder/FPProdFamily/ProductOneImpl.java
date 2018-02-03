package creationHybrids.factoryPrototypeBuilder.FPProdFamily;

public class ProductOneImpl extends ProductBuilder implements Product{
	private final String NAME="Type One";
	public Product makeCopy() {
		try {
			return (ProductOneImpl) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void execute() {
		System.out.println(NAME);		
	}


}
