package behaveObserverPat.codeEx;

public class ConcreteObserver extends ObserverBase{
	
	private ConcreteSubject sub;
	private String name;
	
	public ConcreteObserver(ConcreteSubject s, String n){
		sub=s;
		name=n;
	}
	
	@Override
	public void update(){
		String subState=sub.getState();
		System.out.println(name+":"+subState);
	}

}
