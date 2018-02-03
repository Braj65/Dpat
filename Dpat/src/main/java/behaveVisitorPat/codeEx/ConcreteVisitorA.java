package behaveVisitorPat.codeEx;

public class ConcreteVisitorA extends VisitorBase{

	@Override
	public void Visit(ConcreteElelementA ele) {
		System.out.println("Visitor A visited element A "+ele.Name);		
	}

	@Override
	public void Visit(ConcreteElelementB ele) {
		System.out.println("Visitor A visited element B "+ele.title);		
	}
	
}
