package behaveMementoPat.codeExPluralsight.Caretaker;

import java.util.Stack;

import behaveMementoPat.codeExPluralsight.Memento.IMemento;

public class Caretaker implements ICaretaker{
	private Stack<IMemento> states=new Stack<IMemento>();
	
	public void addState(IMemento memento){
		states.push(memento);
	}
	
	public IMemento undo(){
		return states.pop();
	}
}
