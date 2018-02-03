package behaveMediatorPat.codeEx;

public class Manager {
	
	public static void main(String[] args){
		ConcreteMediator m=new ConcreteMediator();
		
		ConcreteColleague1 c1=new ConcreteColleague1(m);
		ConcreteColleague2 c2=new ConcreteColleague2(m);
		
		m.c1=c1;
		m.c2=c2;
		
		c1.Send("How r u?");
		c2.send("Fine");
	}

}
