package behaveMementoPat.codeEx;

public class Originator {
	private String _state;
	
	public String get_state() {
		return _state;
	}

	public void set_state(String val) {
		this._state = val;
	}
	
	public Memento createMemento(){
		return new Memento(_state);
	}
	
	public void setMemento(Memento m){
		_state=m.getState();
	}

}
