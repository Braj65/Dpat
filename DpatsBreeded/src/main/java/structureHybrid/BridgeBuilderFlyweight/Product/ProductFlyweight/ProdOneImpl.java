package structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight;

public class ProdOneImpl extends ProdBuilderFlyWeight{
	
	private ProdOneImpl(){
		
	}
	
	public static ProdBuilderFlyWeight createProduct(){
		return new ProdOneImpl();
	}

	public void extrinsicMeth() {
		System.out.println(this.speed+" "+this.prodType);
	}

}
