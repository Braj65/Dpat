package behaveObserverPat.codeExPluralsight.IObservable.broadcast;

import java.util.List;

import behaveObserverPat.codeExPluralsight.IObservable.Stock;
import behaveObserverPat.codeExPluralsight.IObservable.observer.IObserver;

public class Unsubscriber implements IDisposable{
	private List<IObserver<Stock>> _observers;
	private IObserver<Stock> _observer;
	
	public Unsubscriber(List<IObserver<Stock>> observers, IObserver<Stock> observer){
		_observers=observers;
		_observer=observer;
	}
	
	public void dispose(){
		if(_observer!=null && _observers.contains(_observer))
			_observers.remove(_observer);
	}
	

}
