package creationHybrids.AbsFactoryBridgeFlyweightBuilder.productFamily;

public class ProductTwoImpl extends ProductBuilder{
	public final String PRODNAME="ProdTwo";
	
	private ProductTwoImpl(ProductBuilder builder){
		super.updateProduct(builder);
	}
	
	public static Product createProduct(ProductBuilder builder){
		return new ProductTwoImpl(builder);
	}
	
	@Override
	public void runProduct() {
		System.out.println(PRODNAME);
	}

}
