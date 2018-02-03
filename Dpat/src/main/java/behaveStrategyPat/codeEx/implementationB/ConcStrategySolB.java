package behaveStrategyPat.codeEx.implementationB;

public class ConcStrategySolB extends AbsStrategySolB{
	private int state=1;

	@Override
	protected void preProcess() {
		System.out.print("PreProcess  ");		
	}

	@Override
	protected boolean search() {
        System.out.print("Search-" + state++ + "  ");
        return state == 3 ? true : false;
	}

	@Override
	protected void postProcess() {
		System.out.print("PostProcess  ");		
	}


}
