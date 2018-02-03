package behaveVisitorPat.realEx;

public class Body implements IElementBase{
	public String name;
	
	public Body(String n){
		name=n;
	}

	@Override
	public void Accept(IVisitorBase visitor) {
		visitor.Visit(this);		
	}
	
}
