package behaveVisitorPat.codeEx;

public class ConcreteVisitorB extends VisitorBase{

	@Override
	public void Visit(ConcreteElelementA ele) {
		System.out.println("Visitor B visited element A "+ele.Name);		
	}

	@Override
	public void Visit(ConcreteElelementB ele) {
		System.out.println("Visitor B visited element B "+ele.title);		
	}

}
