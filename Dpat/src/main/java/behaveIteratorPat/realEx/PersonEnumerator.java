package behaveIteratorPat.realEx;

public class PersonEnumerator extends IPersonIterator{
	
	//private PersonAggregate per;
	private int pos;
	
	public PersonEnumerator(PersonAggregate ag){
		per=ag;
	}

	@Override
	public void moveFirst() throws Exception {
		if(per.persons.size()==0)
			throw new Exception();
		pos=0;
	}

	@Override
	public boolean moveNext() {
		pos++;
		return pos<per.persons.size();
	}
	
	@Override
	public Person curr() throws Exception{
		if(pos<per.persons.size())
			return per.persons.get(pos);
		else
			throw new Exception();
	}

}
