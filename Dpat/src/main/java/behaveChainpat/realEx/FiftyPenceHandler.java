package behaveChainpat.realEx;

public class FiftyPenceHandler extends CoinHandlerBase{
	

	@Override
	public CoinEvalResult EvalCoin(Coin coin) {
		if(Math.abs(coin.weight-8)<2 && Math.abs(coin.diameter-27)<15){
			System.out.println("Captured 50p");
			return CoinEvalResult.Accepted;
		}
		if(base!=null){
			return base.EvalCoin(coin);
		}
		return CoinEvalResult.Rejected;
	}

}
