package behaveObserverPat.realEx;

public class IBMStockObserver implements IStockObserverBase{
	public String name;
	public IBMStockObserver(String name){
		this.name=name;
	}
	@Override
	public void Notify(Stock stock) {
		if(stock.code=="IBM")
			System.out.println("IBM Details"+ name+" "+stock.code+" "+stock.price);
		
	}

}
