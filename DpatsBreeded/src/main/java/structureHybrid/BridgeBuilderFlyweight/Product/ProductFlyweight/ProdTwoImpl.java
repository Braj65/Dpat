package structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight;

public class ProdTwoImpl extends ProdBuilderFlyWeight{
	
	private ProdTwoImpl(){
		
	}
	
	public static ProdBuilderFlyWeight createProduct(){
		return new ProdTwoImpl();
	}

	public void extrinsicMeth() {
		System.out.println(this.speed+" "+this.prodType);
	}

}
