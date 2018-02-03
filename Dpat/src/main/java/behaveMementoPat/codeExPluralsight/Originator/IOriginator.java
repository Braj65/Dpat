package behaveMementoPat.codeExPluralsight.Originator;

import behaveMementoPat.codeExPluralsight.Memento.IMemento;

public interface IOriginator {
	
	IMemento createMemento();
	void getFromMemento(IMemento memento);
	void setVal(Integer val);
	Integer getVal();

}
