package structuralDecoratorPat.realEx;

public class VeggieSandwich extends Sandwich{
	
	public VeggieSandwich(){
		Description="Veggie";
	}
	@Override
	public void getdescription() {
		System.out.println(Description+" -Ingredients of Veggiesandwich");		
	}

	@Override
	public void getPrice() {
		System.out.println("Price of Veggie sandwich");		
	}
}
