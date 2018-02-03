package behaveMementoPat.codeEx;

public class Manager {
	public static void main(String[] args){
		Originator o=new Originator();
		o.set_state("State A");
		Caretaker c=new Caretaker();
		c.setM(o.createMemento());
		o.set_state("State B");
		System.out.println(o.get_state());
		o.setMemento(c.getM());
		System.out.println(o.get_state());
	}
}
