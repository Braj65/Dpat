package structuralDecoratorPat.realEx;

public class SandwichDecorator extends Sandwich{
	
	public final Sandwich sand;
	
	public SandwichDecorator(Sandwich s){
		this.sand=s;
	}

	@Override
	public void getdescription() {
		sand.getdescription();	
	}   

	@Override
	public void getPrice() {
		sand.getPrice();
		
	}
}
