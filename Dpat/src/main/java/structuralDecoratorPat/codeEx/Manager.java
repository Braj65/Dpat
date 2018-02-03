package structuralDecoratorPat.codeEx;

public class Manager {
	
	public static void main(String[] args){
		ConcreteComponent com=new ConcreteComponent();
		ConcreteDecorator dec=new ConcreteDecorator(com);
		dec.Operation();
	}

}
