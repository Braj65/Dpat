package structuralDecoratorPat.realEx;

public class Manager {
	
	public static void main(String[] args){
		Sandwich s1=new TunaSandwich();
		s1.getdescription();
		s1.getPrice();
		System.out.println("-----------------------");
		s1=new Olive(s1);
		s1.getdescription();
		s1.getPrice();
		System.out.println("-----------------------");
		s1=new Cheese(s1);
		s1.getdescription();
		s1.getPrice();
		System.out.println("-----------------------");
	}

}
