package behaveVisitorPat.codeEx;

public class Manager {
	public static void main(String[] args){
		ObjectStructure obs=new ObjectStructure();
		obs.Attach(new ConcreteElelementA());
		obs.Attach(new ConcreteElelementB());
		obs.Accept(new ConcreteVisitorA());
		obs.Accept(new ConcreteVisitorB());
	}
}
