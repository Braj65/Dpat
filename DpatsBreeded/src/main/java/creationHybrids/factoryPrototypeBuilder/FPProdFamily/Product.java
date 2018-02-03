package creationHybrids.factoryPrototypeBuilder.FPProdFamily;

public interface Product extends Cloneable{
	Product makeCopy();
	void execute();
}
