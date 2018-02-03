package creationHybrids.factoryObjectPoolBuilder.FOProdFamily;

public interface Product {
	void close();
	boolean isClosed();
	void expire();
	ProductType getType();
	void execute();
}
