package behaveIteratorPat.realEx;

public class Manager {

	public static void main(String[] args) throws Exception{
		PersonAggregate a=new PersonAggregate();
		Person p1=new Person();
		Person p2=new Person();
		p1.firstName="Jam";
		p2.firstName="Kelly";
		p1.lastName="Smith";
		p2.lastName="rhodes";
		a.persons.add(p1);
		a.persons.add(p2);
		
		IPersonIterator i=a.getIterator();
		while(i.moveNext()){
			System.out.println(i.curr().firstName);
		}
	}
}
