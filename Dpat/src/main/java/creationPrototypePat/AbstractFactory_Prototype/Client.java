package creationPrototypePat.AbstractFactory_Prototype;

import creationPrototypePat.AbstractFactory_Prototype.factory.AbstractFactory;
import creationPrototypePat.AbstractFactory_Prototype.factory.PlatformArchitecture;
import creationPrototypePat.AbstractFactory_Prototype.platforms.PlatformOne_ProductOne;
import creationPrototypePat.AbstractFactory_Prototype.productFamily.ProductOne;

public class Client {
	public static void main(String[] args) {
		AbstractFactory factory=AbstractFactory.getFactory(PlatformArchitecture.PLATFORM_ONE);
		PlatformOne_ProductOne p1p1=new PlatformOne_ProductOne();
		ProductOne p1= factory.createProductOne(p1p1);
	}

}
