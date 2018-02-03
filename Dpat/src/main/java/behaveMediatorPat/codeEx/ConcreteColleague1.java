package behaveMediatorPat.codeEx;

public class ConcreteColleague1 extends ColleagueBase{
	public ConcreteColleague1(MediatorBase v){
		super(v);
	}
	
	public void Send(String message){
		med.sendMessage(this, message);
	}
	
	public void notify(String msg){
		System.out.println("Coll1 gets message "+msg);
	}
}
