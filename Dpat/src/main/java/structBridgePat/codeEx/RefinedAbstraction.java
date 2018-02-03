package structBridgePat.codeEx;

public class RefinedAbstraction extends Abstraction{

	@Override
	public void Operation(){
		implementor.Operation();
	}
}
