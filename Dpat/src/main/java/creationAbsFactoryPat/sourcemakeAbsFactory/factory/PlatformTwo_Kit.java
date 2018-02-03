package creationAbsFactoryPat.sourcemakeAbsFactory.factory;

import creationAbsFactoryPat.sourcemakeAbsFactory.platforms.PlatformTwo_ProductOne;
import creationAbsFactoryPat.sourcemakeAbsFactory.platforms.PlatformTwo_ProductTwo;
import creationAbsFactoryPat.sourcemakeAbsFactory.productFamily.ProductOne;
import creationAbsFactoryPat.sourcemakeAbsFactory.productFamily.ProductTwo;

public class PlatformTwo_Kit extends AbstractFactory{

	@Override
	public ProductOne createProductOne() {
		return new PlatformTwo_ProductOne();
	}

	@Override
	public ProductTwo createProductTwo() {
		return new PlatformTwo_ProductTwo();
	}

}
