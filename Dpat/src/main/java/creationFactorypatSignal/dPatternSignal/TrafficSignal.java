package creationFactorypatSignal.dPatternSignal;

public abstract class TrafficSignal {
	private boolean passageRequested=false;
	public final static int GO = 0;
	public final static int CAUTION = 1;
	public final static int STOP = 2;
	public final static int NUMBER_OF_STATES = 3;
	protected int state=STOP;
	
	public void changeState(){
		this.state = (state + 1) % NUMBER_OF_STATES;
		if(state==GO){
			passageRequested=false;
		}
	}
	
	public int getState(){
		return state;
	}
	
	public boolean getPassageRequested(){
		return passageRequested;	
	}
	
	public void requestPassage(){
		if(state==GO){
			passageRequested=true;
		}
	}
	public void passageGranted(){
		passageRequested=false;
	}
	public abstract String getMessage();
	
	public String toString(){
		return "["+this.getClass()+": "+this.getMessage()+" "+this.passageRequested+"]";
	}
	
	public static void main(String[] args){
		WalkSign s1=new WalkSign();
		for(int i=0;i<=NUMBER_OF_STATES;i++){
			s1.getMessage();
			s1.changeState();
		}
		
		TrafficLight t1=new TrafficLight();
		for(int i=0;i<=NUMBER_OF_STATES;i++){
			System.out.println(t1.getMessage());
			t1.changeState();
		}
	}
}
