package structuralDecoratorPat.realEx;

public class TunaSandwich extends Sandwich{
	
	public TunaSandwich(){
		Description="Tuna";
	}
	@Override
	public void getdescription() {
		System.out.println(Description+ " -Ingredients of Tunasandwich");
		
	}

	@Override
	public void getPrice() {
		System.out.println("Price of Tuna sandwich");		
	}
	

}
