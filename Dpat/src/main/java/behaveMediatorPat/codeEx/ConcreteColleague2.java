package behaveMediatorPat.codeEx;

public class ConcreteColleague2 extends ColleagueBase{

	public ConcreteColleague2(MediatorBase bae) {
		super(bae);
	}
	
	public void send(String msg){
		med.sendMessage(this, msg);
	}
	
	public void notify(String msg){
		System.out.println("coll2 gets message "+msg);
	}

}
