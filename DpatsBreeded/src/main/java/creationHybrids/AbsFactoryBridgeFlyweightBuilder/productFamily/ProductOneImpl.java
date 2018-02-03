package creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily;

public class ProductOneImpl extends ProductBuilder{
	private final String PRODNAME="Prod One";
	
	private ProductOneImpl(ProductBuilder builder){
		super.updateProduct(builder);
	}
	
	public static ProductOneImpl createProduct(ProductBuilder builder){
		return new ProductOneImpl(builder);
	}

	@Override
	public void runProduct() {
		System.out.println(PRODNAME);		
	}
}
