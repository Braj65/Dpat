package structuralFlyWeightPat.codeEx;

public class UnsharedFlyweight extends FlyweightBase{
	private Object _state;

	@Override
	public void statefulOperation(Object o) {
		_state=o;
		System.out.println("state from unsharedfly "+_state);
		
	}
	
	

}
