package structuralDecoratorPat.realEx;

public class Cheese extends SandwichDecorator{
	
	public Cheese(Sandwich s){
		super(s);		
	}
	
	@Override
	public void getdescription(){
		System.out.println("Cheese");
		super.getdescription();
	}
	
	@Override
	public void getPrice(){
		super.getPrice();
	}

}
