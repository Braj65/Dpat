package behaveMementoPat.codeExPluralsight.Memento;

public class Memento implements IMemento{
	public Object state;
	
	public Memento(Object copy){
		state=copy;
	}
	
	@Override
	public Object getState() {
		return state;
	}

	@Override
	public void setState() {
		// TODO Auto-generated method stub
		
	}

}
