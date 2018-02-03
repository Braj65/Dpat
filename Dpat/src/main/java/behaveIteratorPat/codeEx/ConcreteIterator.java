package behaveIteratorPat.codeEx;

public class ConcreteIterator extends Iterator{
	
	private final ConcreteAggregate concreteAggregate;
	private int curr;
	
	public ConcreteIterator(ConcreteAggregate agg){
		concreteAggregate=agg;
	}

	@Override
	public Object first() {
		return concreteAggregate.items.get(0);
	}

	@Override
	public Object next() {
		Object ret=null;
		if(curr<concreteAggregate.items.size()-1)
			ret=concreteAggregate.items.get(++curr);
		return ret;
	}

	@Override
	public Object isDone() {
		return curr>=concreteAggregate.items.size();
	}

}
