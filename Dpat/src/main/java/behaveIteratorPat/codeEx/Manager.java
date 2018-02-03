package behaveIteratorPat.codeEx;

public class Manager {
	
	public static void main(String[] args){
		ConcreteAggregate con=new ConcreteAggregate();
		con.items.add("item 1");
		con.items.add("item 2");
		con.items.add("item 3");
		con.items.add("item 4");
		
		ConcreteIterator icon=new ConcreteIterator(con);
		
		Object it=icon.first();
		while(it!=null){
			System.out.println(it);
			it=icon.next();
		}
	}

}
