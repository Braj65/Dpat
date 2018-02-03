package structuralAdapterPat.realEx;

import java.util.ArrayList;
import java.util.List;

public class DataSerializer {
	
	private final ISerializerAdapter iserial;
	
	public DataSerializer(ISerializerAdapter ser){
		iserial=ser;
	}
	
	public String render(){
		StringBuilder build=new StringBuilder();
		List<PersonInfo> list=new ArrayList<PersonInfo>();
		PersonInfo inf=new PersonInfo();
		inf.setFirstName("Rob");
		inf.setLastName("Bane");
		list.add(inf);
		
		for(PersonInfo x: list){
			build.append(iserial.serialize(x));
		}
		
		return build.toString();
	}

}
