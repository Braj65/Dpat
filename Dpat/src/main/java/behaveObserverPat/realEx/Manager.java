package behaveObserverPat.realEx;

public class Manager {
	
	public static void main(String[] args){
		ConcreteStockTicker cst=new ConcreteStockTicker();
		IBMStockObserver ibm=new IBMStockObserver("Rober");
		AllStockObserver all=new AllStockObserver("Ivor");
		
		cst.register(ibm);
		cst.register(all);
		
		for(Stock k:StockData.getNext()){
			cst.setStk(k);
		}
	}

}
