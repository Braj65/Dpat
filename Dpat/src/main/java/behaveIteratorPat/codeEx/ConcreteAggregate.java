package behaveIteratorPat.codeEx;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate{

	public final List items=new ArrayList();

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	public int count(){
		return items.size();
	}
		
}
