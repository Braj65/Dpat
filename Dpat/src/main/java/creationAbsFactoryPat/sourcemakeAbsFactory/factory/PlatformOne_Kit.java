package creationAbsFactoryPat.sourcemakeAbsFactory.factory;

import creationAbsFactoryPat.sourcemakeAbsFactory.platforms.PlatformOne_ProductOne;
import creationAbsFactoryPat.sourcemakeAbsFactory.platforms.PlatformOne_ProductTwo;
import creationAbsFactoryPat.sourcemakeAbsFactory.productFamily.ProductOne;
import creationAbsFactoryPat.sourcemakeAbsFactory.productFamily.ProductTwo;

public class PlatformOne_Kit extends AbstractFactory{

	@Override
	public ProductOne createProductOne() {
		return new PlatformOne_ProductOne();
	}

	@Override
	public ProductTwo createProductTwo() {
		return new PlatformOne_ProductTwo();
	}

}
