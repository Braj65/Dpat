package behaveStrategyPat.codeEx;

import behaveStrategyPat.codeEx.implementationA.ConcStrategySolA;
import behaveStrategyPat.codeEx.implementationB.ConcStrategySolB;

public class Client {
	public static void main(String[] args) {
		ProductBase[] algos={new ConcStrategySolA(), new ConcStrategySolB()};
		for(ProductBase algo:algos)
			algo.solve();
	}
}
