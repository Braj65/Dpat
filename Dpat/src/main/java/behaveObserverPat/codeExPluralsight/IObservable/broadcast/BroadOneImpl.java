package behaveObserverPat.codeExPluralsight.IObservable.broadcast;

import behaveObserverPat.codeExPluralsight.IObservable.Stock;

public class BroadOneImpl extends Broadcaster{
	
	public void setValue(Stock s){
		this.stock=s;
		this.notifyObservers(s);
	}
}
