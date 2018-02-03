package behaveMementoPat.realEx;

import java.util.List;
import java.util.ArrayList;

public class PersonCareTaker {
	
	public List<PersonMemento> h=new ArrayList<PersonMemento>();

	public PersonMemento getMemento() {
		PersonMemento m=h.get(0);
		h.remove(0);
		return m;
	}

	public void add(PersonMemento m) {
		h.add(m);
	}
}
