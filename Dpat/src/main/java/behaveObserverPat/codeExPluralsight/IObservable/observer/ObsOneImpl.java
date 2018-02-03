package behaveObserverPat.codeExPluralsight.IObservable.observer;

import behaveObserverPat.codeExPluralsight.IObservable.Stock;

public class ObsOneImpl implements IObserver<Stock>{

	@Override
	public void update(Stock s) {
		if(s.symbol=="GOOG")
			System.out.println("New price "+s.price);
	}

	@Override
	public void onError(Exception e) {
		System.out.println("Error occured in stock ticker");
		
	}
}
