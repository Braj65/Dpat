package structureHybrid.BridgeBuilderFlyweight.Product.ProductFlyweight;

public enum ProductType {
	TYPEONE, TYPETWO;
	
	public String toString(){
		switch(this){
		case TYPEONE:
			return "one";
		case TYPETWO:
			return "two";
			default:
				return "";
		}
	}

}
