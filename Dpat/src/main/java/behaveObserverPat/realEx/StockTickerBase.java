package behaveObserverPat.realEx;

import java.util.ArrayList;
import java.util.List;

public abstract class StockTickerBase {
	public List<IStockObserverBase> obs=new ArrayList<IStockObserverBase>();
	
	public void register(IStockObserverBase bae){
		if(!obs.contains(bae)){
			obs.add(bae);
		}
	}
	
	public void unRegister(IStockObserverBase ab){
		if(obs.contains(ab)){
			obs.remove(ab);
		}
	}
	
	public abstract void Notify();
}
