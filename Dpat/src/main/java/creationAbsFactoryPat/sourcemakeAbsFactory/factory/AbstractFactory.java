package creationAbsFactoryPat.sourcemakeAbsFactory.factory;

import creationAbsFactoryPat.sourcemakeAbsFactory.productFamily.ProductOne;
import creationAbsFactoryPat.sourcemakeAbsFactory.productFamily.ProductTwo;

public abstract class AbstractFactory {
	private static final PlatformOne_Kit PLATFORMONEKIT=new PlatformOne_Kit();
	private static final PlatformTwo_Kit PLATFORMTWOKIT=new PlatformTwo_Kit();
	
	public static AbstractFactory getFactory(PlatformArchitecture arch){
		AbstractFactory factory=null;
		switch(arch){
			case PLATFORM_ONE:
				factory=PLATFORMONEKIT;
				break;
			case PLATFORM_TWO:
				factory=PLATFORMTWOKIT;
				break;
		}
		return factory;
	}
	
	
	public abstract ProductOne createProductOne();
	
	public abstract ProductTwo createProductTwo();

}
