package structureHybrid.OPDecoProxyBuild.BaseProduct.Product;

public enum ProductType {
	PRODONE, PRODTWO;
	
	public String toString(){
		switch(this){
		case PRODONE:
			return "One";
		case PRODTWO:
			return "Two";
			default:
				return "";		
		}
	}
}
