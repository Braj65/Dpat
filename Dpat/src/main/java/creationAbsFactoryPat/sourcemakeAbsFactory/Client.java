package creationAbsFactoryPat.sourcemakeAbsFactory;

import creationAbsFactoryPat.sourcemakeAbsFactory.factory.AbstractFactory;
import creationAbsFactoryPat.sourcemakeAbsFactory.factory.PlatformArchitecture;
import creationAbsFactoryPat.sourcemakeAbsFactory.productFamily.ProductOne;
import creationAbsFactoryPat.sourcemakeAbsFactory.productFamily.ProductTwo;

public class Client {
	public static void main(String[] args) {
		AbstractFactory factory=AbstractFactory.getFactory(PlatformArchitecture.PLATFORM_TWO);
		ProductOne prodOne=factory.createProductOne();
	}
}
