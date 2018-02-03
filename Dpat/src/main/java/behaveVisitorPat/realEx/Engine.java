package behaveVisitorPat.realEx;

public class Engine implements IElementBase {

	public String name;
	public Engine(String n){
		name=n;
	}
	
	@Override
	public void Accept(IVisitorBase visitor) {
		visitor.Visit(this);
	}

}
