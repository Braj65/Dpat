package behaveChainpat.realEx;

public abstract class CoinHandlerBase {
	public CoinHandlerBase base;
	
	public void setSuccesor(CoinHandlerBase succ){
		base=succ;
	}
	
	public abstract CoinEvalResult EvalCoin(Coin coin);
}
