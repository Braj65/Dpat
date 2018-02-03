package structuralFlyWeightPat.codeEx;

import java.util.HashMap;


public class FlyweightFactory {	
	//public List<FlyweightBase> flyWeights=new ArrayList<FlyweightBase>();
	private final HashMap<Integer, FlyweightBase> flyWeights=new HashMap<Integer, FlyweightBase>();
	
	public FlyweightBase getFlyWeight(Integer key){
		if(flyWeights.containsKey(key)){
			return (FlyweightBase) flyWeights.get(key);
		}
		
		FlyweightBase fly=new ConcreteFlyweight(key);
		flyWeights.put(key, fly);
		return fly;
	}
}
