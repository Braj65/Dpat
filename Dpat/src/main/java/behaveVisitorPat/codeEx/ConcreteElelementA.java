package behaveVisitorPat.codeEx;

public class ConcreteElelementA extends ElementBase {

	@Override
	public void Accept(VisitorBase visitor) {
		visitor.Visit(this);
	}
	
	public String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
