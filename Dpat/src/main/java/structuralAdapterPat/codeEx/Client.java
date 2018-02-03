package structuralAdapterPat.codeEx;

public class Client {
	private final ITarget target;
	public Client(ITarget target){
		this.target=target;
	}
	public void request(){
		target.methodA();
	}
}
