package creationPrototypePat.AbstractFactory_Prototype.factory;

import creationPrototypePat.AbstractFactory_Prototype.productFamily.ProductOne;
import creationPrototypePat.AbstractFactory_Prototype.productFamily.ProductTwo;

public class PlatformOne_Kit extends AbstractFactory{

	@Override
	public ProductOne createProductOne(ProductOne p1) {
		return p1.makeCopy();
	}

	@Override
	public ProductTwo createProductTwo(ProductTwo p2) {
		return p2.makeCopy();
	}

}
