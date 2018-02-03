package behaveObserverPat.codeExPluralsight.IObservable.observer;

import behaveObserverPat.codeExPluralsight.IObservable.Stock;

public interface IObserver<T> {
	void onError(Exception e);
	void update(T t);

}
