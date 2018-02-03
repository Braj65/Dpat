package behaveObserverPat.codeExPluralsight.eventDelegate.observer;

import behaveObserverPat.codeExPluralsight.eventDelegate.broadcast.Broadcaster;

public class ObsOneImpl implements Observer{
	public Broadcaster dataSource;
	public ObsOneImpl(Broadcaster broad) {
		dataSource=broad;
		broad.register(this);
	}

	@Override
	public void update(Broadcaster broad) {
		int price=dataSource.price;
		String symbol=dataSource.symbol;
		
		if(symbol=="GOOG")
			System.out.println("New price "+price);
	}

}
