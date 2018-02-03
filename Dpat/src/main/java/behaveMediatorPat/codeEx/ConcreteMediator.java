package behaveMediatorPat.codeEx;

public class ConcreteMediator extends MediatorBase{
	
	public ConcreteColleague1 c1;
	public ConcreteColleague2 c2;
	
	
	@Override
	public void sendMessage(ColleagueBase caller, String msg) {
		if(caller==c1){
			c2.notify(msg);
		}else{
			c1.notify(msg);
		}
	}
	

}
