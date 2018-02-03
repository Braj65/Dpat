package behaveObserverPat.codeExPluralsight.traditional.observer;

import behaveObserverPat.codeExPluralsight.traditional.broadcast.Broadcaster;

public class ObsOneImpl implements Observer{
	public Broadcaster dataSource;
	public ObsOneImpl(Broadcaster broad) {
		dataSource=broad;
		broad.register(this);
	}

	@Override
	public void update() {
		int price=dataSource.price;
		String symbol=dataSource.symbol;
		
		if(symbol=="GOOG")
			System.out.println("New price "+price);
	}

}
