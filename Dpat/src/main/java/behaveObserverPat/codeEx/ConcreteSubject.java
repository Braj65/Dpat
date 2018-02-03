package behaveObserverPat.codeEx;

public class ConcreteSubject extends SubjectBase{
	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		Notify();
	}
	
}
