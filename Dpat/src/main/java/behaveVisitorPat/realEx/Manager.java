package behaveVisitorPat.realEx;

public class Manager {
	public static void main(String[] args){
		Car c=new Car();
		c.Attach(new Body("Nissan"));
		c.Attach(new Engine("Twin v"));
		c.Accept(new CarElementPrintVisitor());
		c.Accept(new CarElementPrintVisitor());
	}
}
