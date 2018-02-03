package behaveIteratorPat.realEx;

import java.util.ArrayList;
import java.util.List;

public class PersonAggregate extends IPersonEnumerable{
	
	@Override
	public IPersonIterator getIterator() {
		return new PersonEnumerator(this);
	}

}
