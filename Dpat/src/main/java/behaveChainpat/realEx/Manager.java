package behaveChainpat.realEx;

public class Manager {
	public static void main(String[] args){
		CoinHandlerBase h5=new FivePenceHandler();
		CoinHandlerBase h50=new FiftyPenceHandler();
		CoinHandlerBase h100=new OnePoundHandler();
		h5.setSuccesor(h50);
		h50.setSuccesor(h100);
		
		Coin five=new Coin();
		five.diameter=25;
		five.weight=7;
		Coin fifty=new Coin();
		fifty.diameter=28;
		fifty.weight=8;
		Coin one=new Coin();
		one.diameter=23;
		one.weight=9;
		
		System.out.println(h5.EvalCoin(fifty));
		System.out.println(h5.EvalCoin(one));
	}

}
