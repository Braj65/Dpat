package behaveObserverPat.codeEx;

public class Manager {
	public static void main(String[] args){
		ConcreteSubject cs=new ConcreteSubject();
		cs.attach(new ConcreteObserver(cs, "Observer 1"));
		cs.attach(new ConcreteObserver(cs, "Observer 2"));
		cs.attach(new ConcreteObserver(cs, "Observer 3"));
		cs.setState("State");
	}
}
