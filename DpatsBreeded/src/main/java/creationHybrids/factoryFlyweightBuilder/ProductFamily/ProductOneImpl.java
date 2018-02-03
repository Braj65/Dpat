package creationHybrids.factoryFlyweightBuilder.ProductFamily;

public class ProductOneImpl extends ProductBuilder{
	private final String PRODNAME="Prod One";
	
	private ProductOneImpl(ProductBuilder builder){
		super.updateProduct(builder);
	}

	public ProductOneImpl() {}

	public static Product createProduct(ProductBuilder builder) {
		return new ProductOneImpl(builder);
	}
	
	public static ProductBuilder createProduct(){
		return new ProductOneImpl();
	}

	@Override
	public void useProduct() {
		System.out.println(PRODNAME);		
	}
	
}
