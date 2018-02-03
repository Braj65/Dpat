package behaveStrategyPat.codeEx.implementationA;

import behaveStrategyPat.codeEx.ProductBase;

public abstract class AbsStrategySolA implements ProductBase{
	
	public void solve(){
		start();
		while(nextTry() && !isSolution()){}
		stop();
	}
	abstract void start();
	abstract boolean nextTry();
	abstract boolean isSolution();
	abstract void stop();
}
