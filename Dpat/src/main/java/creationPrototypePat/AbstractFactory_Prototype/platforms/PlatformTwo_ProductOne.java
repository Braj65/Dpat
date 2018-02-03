package creationPrototypePat.AbstractFactory_Prototype.platforms;

import creationPrototypePat.AbstractFactory_Prototype.productFamily.ProductOne;

public class PlatformTwo_ProductOne implements ProductOne{

	@Override
	public ProductOne makeCopy() {
		ProductOne prod1=null;
		try {
			prod1=(ProductOne) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prod1;
	}

}
