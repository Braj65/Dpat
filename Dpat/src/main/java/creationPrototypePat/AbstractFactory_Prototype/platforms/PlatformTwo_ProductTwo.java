package creationPrototypePat.AbstractFactory_Prototype.platforms;

import creationPrototypePat.AbstractFactory_Prototype.productFamily.ProductTwo;

public class PlatformTwo_ProductTwo implements ProductTwo{

	@Override
	public ProductTwo makeCopy() {
		ProductTwo prod2=null;
		try {
			prod2=(ProductTwo) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prod2;
	}

}
