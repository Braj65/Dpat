package behaveChainpat.realEx;

public class OnePoundHandler extends CoinHandlerBase{
	
	@Override
	public CoinEvalResult EvalCoin(Coin coin) {
		if(Math.abs(coin.weight-10)<2 && Math.abs(coin.diameter-22)<13){
			System.out.println("Captured 1Pound");
			return CoinEvalResult.Accepted;
		}
		if(base!=null){
			return base.EvalCoin(coin);
		}
		return CoinEvalResult.Rejected;
	}

}
