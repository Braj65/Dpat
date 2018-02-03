package behaveStatePat.codeEx;

public class Context {
	
	private StateBase sta;
	public StateBase s2;
	
	public Context(StateBase s){
		sta=s;
		this.setS2(sta);
	}
	
	public void request(){
		sta.Handle(this);
	}
	
	public StateBase getS2() {
		return s2;
	}

	public void setS2(StateBase val) {
		sta=val;
		System.out.println("Curr state "+sta.getClass());
	}	

}
