package behaveStrategyPat.codeEx.implementationB;

import behaveStrategyPat.codeEx.ProductBase;

public abstract class AbsStrategySolB implements ProductBase{
	
	public void solve(){
		while(true){
			preProcess();
			if(search())
				break;
			postProcess();
		}
	}	
    abstract void preProcess();
    abstract boolean search();
    abstract void postProcess();
}
