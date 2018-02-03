package behaveObserverPat.codeExPluralsight.IObservable;

import behaveObserverPat.codeExPluralsight.IObservable.broadcast.BroadOneImpl;
import behaveObserverPat.codeExPluralsight.IObservable.broadcast.Broadcaster;
import behaveObserverPat.codeExPluralsight.IObservable.broadcast.IDisposable;
import behaveObserverPat.codeExPluralsight.IObservable.observer.IObserver;
import behaveObserverPat.codeExPluralsight.IObservable.observer.ObsOneImpl;

public class Client {
	public static void main(String[] args) {
		Broadcaster caster=new BroadOneImpl();
		IObserver<Stock> obs=new ObsOneImpl();
		
		IDisposable toDispose=caster.register(obs);
		
		Stock s=new Stock();
		s.price=10;
		s.symbol="Goo";
		caster.setValue(s);
		
	}

}
