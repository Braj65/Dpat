package behaveIteratorPat.realEx;

import java.util.*;

public abstract class IPersonEnumerable {
	public List<Person> persons=new ArrayList<Person>();
	public abstract IPersonIterator getIterator();

}
