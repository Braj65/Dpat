package structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight;

public interface ProdFlyWeight {
	void extrinsicMeth();
	ProdFlyWeight upgrade(ProdBuilderFlyWeight prod);
}
