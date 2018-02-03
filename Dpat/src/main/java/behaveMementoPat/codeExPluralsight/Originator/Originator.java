package behaveMementoPat.codeExPluralsight.Originator;

import behaveMementoPat.codeExPluralsight.Memento.IMemento;
import behaveMementoPat.codeExPluralsight.Memento.Memento;

public class Originator implements IOriginator{

	public Integer val;
	
	public Originator(int v){
		val=v;
	}
	
	@Override
	public IMemento createMemento() {
		return new Memento(val);
	}

	@Override
	public void getFromMemento(IMemento memento) {
		val= (Integer) memento.getState();
		
	}

	@Override
	public void setVal(Integer val) {
		this.val=val;		
	}

	@Override
	public Integer getVal() {
		return val;
	}

}
