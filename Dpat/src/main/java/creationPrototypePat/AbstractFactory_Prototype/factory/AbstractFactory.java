package creationPrototypePat.AbstractFactory_Prototype.factory;

import creationPrototypePat.AbstractFactory_Prototype.productFamily.ProductOne;
import creationPrototypePat.AbstractFactory_Prototype.productFamily.ProductTwo;

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
	
	
	public abstract ProductOne createProductOne(ProductOne p1);
	
	public abstract ProductTwo createProductTwo(ProductTwo p2);

}
