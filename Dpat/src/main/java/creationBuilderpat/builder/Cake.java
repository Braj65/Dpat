package creationBuilderpat.builder;

public class Cake {
	 private final double sugar;   //cup
	 private final double butter;  //cup
	 private final int eggs;
	 private final int vanila;     //spoon
	 private final double flour;   //cup
	 private final double bakingpowder; //spoon
	 
	 private Cake(Builder builder){
		 this.sugar=builder.sugar;
		 this.butter=builder.butter;
		 this.eggs=builder.eggs;
		 this.vanila=builder.vanila;
		 this.flour=builder.flour;
		 this.bakingpowder=builder.bakingpowder;
	 }
	 
	 @Override
	 public String toString(){
		 return "Cake{sugar="+sugar+", butter="+butter+", eggs="+eggs+", vanila="+vanila+
				 ", flour="+flour+", bakingpowder="+bakingpowder+"}";
	 }	 	
	
	public static class Builder{
		 private double sugar;   //cup
		 private double butter;  //cup
		 private int eggs;
		 private int vanila;     //spoon
		 private double flour;   //cup
		 private double bakingpowder; //spoon
		 
		 public Builder sugar(double cup){
			 this.sugar=cup;
			 return this;
		 }
		 public Builder butter(double cup){
			 this.butter=cup;
			 return this;
		 }
		 public Builder eggs(int number){
			 this.eggs=number;
			 return this;
		 }
		 public Builder vanilla(int spoon){
			 this.vanila=spoon;
			 return this;
		 }
		 public Builder flour(double cup){
			 this.flour=cup;
			 return this;
		 }
		 public Builder bakingpowder(int spoon){
			 this.bakingpowder=spoon;
			 return this;
		 }		
		
		 public Cake build(){
			 return new Cake(this);
		 }
	}

}
