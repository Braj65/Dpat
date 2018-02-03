package creationHybrids.factoryFlyweightBuilder.ProductFamily;


public class ProductTwoImpl extends ProductBuilder{
	private final String PRODNAME="Prod Two";
	private ProductTwoImpl(ProductBuilder builder){
		super.updateProduct(builder);
	}
	
	public ProductTwoImpl(){}

	public static Product createProduct(ProductBuilder builder) {
		return new ProductTwoImpl(builder);
	}
	
	public static ProductBuilder createProduct(){
		return new ProductOneImpl();
	}

	public void useProduct() {
		System.out.println(PRODNAME);		
	}

}
