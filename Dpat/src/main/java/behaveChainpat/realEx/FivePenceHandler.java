package behaveChainpat.realEx;

public class FivePenceHandler extends CoinHandlerBase{

	@Override
	public CoinEvalResult EvalCoin(Coin coin) {
		if(Math.abs(coin.weight-4)<2 && Math.abs(coin.diameter-18)<10){
			System.out.println("Captured 5p");
			return CoinEvalResult.Accepted;
		}
		if(base!=null){
			return base.EvalCoin(coin);
		}
		return CoinEvalResult.Rejected;
	}
}
