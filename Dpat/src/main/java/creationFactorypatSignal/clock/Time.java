package creationFactorypatSignal.clock;

public class Time {
	private int currentTime=0;
	private int endOfTime;
	
	private static Time obj=null; 
	
	private Time(){
		endOfTime=600;
	}
	
	public void run(){
		if(currentTime<endOfTime){
			currentTime=currentTime+1;
		}
	}
	
	public static int getCurrentTime(){
		if(obj==null){
			obj=new Time();
			return obj.currentTime;
		}else{
			return obj.currentTime;
		}
		
		
	}
}
