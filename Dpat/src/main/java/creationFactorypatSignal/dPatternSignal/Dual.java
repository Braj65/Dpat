package creationFactorypatSignal.dPatternSignal;

public class Dual {	
	private static Dual instance1=null;
	private static Dual instance2=null;
	private Dual(){		
	}
	
	public static Dual getInstance1(){
		if(instance1==null){
			instance1=new Dual();
			return instance1;
		}else{
			return instance1;
		}
	}
	public static Dual getInstance2(){
		if(instance2==null){
			instance2=new Dual();
			return instance2;
		}else{
			return instance2;
		}
	}

}
