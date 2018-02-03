package structuralAdapterPat.realEx;

public class PersonInfo {
	//ISerializerAdapter iSer;
	
	public String firstName;
	public String lastName;
	
	/*public PersonInfo(ISerializerAdapter iSer){
		this.iSer=iSer;
	}
	
	public void request(Object obj){
		iSer.serialize(obj);
	}*/
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
