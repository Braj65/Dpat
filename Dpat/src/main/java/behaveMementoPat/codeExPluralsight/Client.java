package behaveMementoPat.codeExPluralsight;

import behaveMementoPat.codeExPluralsight.Caretaker.Caretaker;
import behaveMementoPat.codeExPluralsight.Caretaker.ICaretaker;
import behaveMementoPat.codeExPluralsight.Memento.IMemento;
import behaveMementoPat.codeExPluralsight.Originator.IOriginator;
import behaveMementoPat.codeExPluralsight.Originator.Originator;

public class Client {
	public static void main(String[] args) {
		IOriginator originator=new Originator(30);
		ICaretaker caretaker=new Caretaker();
		IMemento mem=originator.createMemento();
		caretaker.addState(mem);
		//
		originator.setVal(20);
		System.out.println(originator.getVal());
		originator.getFromMemento(caretaker.undo());
		System.out.println(originator.getVal());
	}
}
