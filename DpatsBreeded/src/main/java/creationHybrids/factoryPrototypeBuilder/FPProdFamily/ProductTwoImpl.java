package creationHybrids.factoryPrototypeBuilder.FPProdFamily;

public class ProductTwoImpl extends ProductBuilder implements Product{
	private final String NAME="Type Two";
	public Product makeCopy() {
		try {
			return (ProductTwoImpl) super.clone();
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
