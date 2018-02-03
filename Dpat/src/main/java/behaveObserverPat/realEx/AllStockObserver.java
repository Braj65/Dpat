package behaveObserverPat.realEx;

public class AllStockObserver implements IStockObserverBase{
	public String name;
	
	public AllStockObserver(String name){
		this.name=name;
	}

	@Override
	public void Notify(Stock stock) {
		System.out.println("Stock details "+name+stock.code+stock.price);
		
	}
	

}
