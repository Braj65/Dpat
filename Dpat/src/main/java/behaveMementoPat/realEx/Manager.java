package behaveMementoPat.realEx;

public class Manager {
	public static void main(String[] args){
		Person p1=new Person();
		p1.firstName="john";
		p1.lastName="doe";

		PersonCareTaker ct1=new PersonCareTaker();
		ct1.add(p1.createUndo());
		
		p1.firstName="Bryle";
		p1.lastName="rhodes";
		
		ct1.add(p1.createUndo());
		
		p1.firstName="Jammy";
		p1.lastName="Jammer";
		p1.showInfo();
		
		p1.Undo(ct1.getMemento());
		p1.showInfo();
		
		p1.Undo(ct1.getMemento());
		p1.showInfo();		
	}
}
