package structuralDecoratorPat.realEx;

public class Olive extends SandwichDecorator{
	
	public Olive(Sandwich s){
		super(s);
		Description="Olives";
	}
	
	@Override
	public void getdescription(){
		System.out.println(Description);
		super.getdescription();		
	}
	
	@Override
	public void getPrice(){
		super.getPrice();
	}
}
