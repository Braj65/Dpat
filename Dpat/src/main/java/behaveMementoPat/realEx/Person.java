package behaveMementoPat.realEx;

public class Person {
	
	public String firstName;
	public String lastName;
	
	public PersonMemento createUndo(){
		return new PersonMemento(firstName, lastName);
	}
	
	public void Undo(PersonMemento mem){
		firstName=mem.firstName;
		lastName=mem.lastName;
	}
	
	public void showInfo(){
		System.out.println("FName "+firstName);
		System.out.println("lName "+lastName);
	}

}
