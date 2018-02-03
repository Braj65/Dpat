package structBridgePat.codeEx;

public class Abstraction {
	public Implementor implementor;
	
	public Abstraction(){
		implementor=new ConcreteImplementorA();
	}
	
	public void Operation(){
		implementor.Operation();
	}
	
}
