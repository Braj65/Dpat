package behaveObserverPat.realEx;

public class ConcreteStockTicker extends StockTickerBase{
	private Stock stk;

	public Stock getStk() {
		return stk;
	}

	public void setStk(Stock stk) {
		this.stk = stk;
		Notify();
	}

	@Override
	public void Notify() {
		for(IStockObserverBase b:obs){
			b.Notify(stk);
		}
	}
	
	
}
