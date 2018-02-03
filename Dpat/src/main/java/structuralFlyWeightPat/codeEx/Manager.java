package structuralFlyWeightPat.codeEx;

public class Manager {
	
	public static void main(String[] args){
		int extrinsicState=22;
		FlyweightFactory fac=new FlyweightFactory();
		FlyweightBase fac1=fac.getFlyWeight(10);
		fac1.statefulOperation(extrinsicState);
		
		FlyweightBase fac2=fac.getFlyWeight(20);
		fac2.statefulOperation(extrinsicState);
		
		FlyweightBase fac3=fac.getFlyWeight(10);
		extrinsicState=33;
		fac3.statefulOperation(extrinsicState);
		
		FlyweightBase fac4=new UnsharedFlyweight();
		fac4.statefulOperation(extrinsicState);		
	}
	
	

}
