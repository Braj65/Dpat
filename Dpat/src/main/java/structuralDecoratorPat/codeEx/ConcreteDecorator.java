package structuralDecoratorPat.codeEx;

public class ConcreteDecorator extends DecoratorBase{

	public ConcreteDecorator(ComponentBase comp) {
		super(comp);
	}

	@Override
	public void Operation() {
		super.Operation();
		System.out.println("Cocnretedecorator.operation()");
	}

}
