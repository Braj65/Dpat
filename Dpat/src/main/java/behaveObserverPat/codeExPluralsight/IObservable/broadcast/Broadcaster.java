package behaveObserverPat.codeExPluralsight.IObservable.broadcast;

import java.util.ArrayList;
import java.util.List;

import behaveObserverPat.codeExPluralsight.IObservable.Stock;
import behaveObserverPat.codeExPluralsight.IObservable.observer.IObserver;

public abstract class Broadcaster {
	protected Stock stock;
	List<IObserver<Stock>> observers=new ArrayList<IObserver<Stock>>();
	
	public abstract void setValue(Stock s);
	
	public IDisposable register(IObserver<Stock> obs){
		if(!observers.contains(obs))
			observers.add(obs);
		return new Unsubscriber(observers, obs);
//		observers.add(obs);
	}
	
	public void unregister(IObserver obs){
		observers.remove(obs);
	}
	
	public void notifyObservers(Stock s){
		for(IObserver o:observers){
			if(s.symbol==null || s.price<0)
				o.onError(new Exception("Bad stock data"));
			else
				o.update(s);
		}
	}

}
