package creationHybrids.factoryObjectPoolBuilder.FOProdFamily;

public enum ProductType {
	TYPEONE, TYPETWO;
	
	public String toString(){
		switch(this){
		case TYPEONE:
			return "one";
		case TYPETWO:
			return "two";
			default:
				return null;		
		}
	}
	
	public Product create(){
		switch(this){
		case TYPEONE:
			return new ProductOneImpl();
		case TYPETWO:
			return new ProductTwoImpl();
			default:
				return null;
		}
	}
}
