package behaveStrategyPat.codeEx.implementationA;

public class ConcStrategySolA extends AbsStrategySolA{
	private int state=1;
	@Override
	protected void start() {
		System.out.println("Start");
		
	}

	@Override
	protected boolean nextTry() {
		System.out.println("Next Try "+ state++ +" ");
		return true;
	}

	@Override
	protected boolean isSolution() {
		System.out.println("Is Solution "+ (state==3)+ " ");
		return state==3;
	}

	@Override
	protected void stop() {
		System.out.println("Start");
		
	}

}
