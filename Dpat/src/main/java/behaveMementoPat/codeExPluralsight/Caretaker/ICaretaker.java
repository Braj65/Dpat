package behaveMementoPat.codeExPluralsight.Caretaker;

import behaveMementoPat.codeExPluralsight.Memento.IMemento;

public interface ICaretaker {
	
	void addState(IMemento mem);
	IMemento undo();

}
