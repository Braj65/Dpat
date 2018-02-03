package creationHybrids.factoryPrototypeBuilder.FPProdFamily;

public enum ProductType {
	TYPEONE, TYPETWO;
	
	public String toString(){
		switch(this){
		case TYPEONE:
			return "One";
		case TYPETWO:
			return "Two";
			default:
				return null;
		}
	}
}
