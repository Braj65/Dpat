package structuralFlyWeightPat.codeEx;

public class ConcreteFlyweight extends FlyweightBase{
	
	Integer intrinsicProp=0;
	Integer extrinsicProp=0;
	
	public ConcreteFlyweight(Integer x){
		intrinsicProp=x;
	}
	
	@Override
	public void statefulOperation(Object o) {
		extrinsicProp=(int) o;
		System.out.println("From ConcreteFlyweight "+extrinsicProp);
	}

}
