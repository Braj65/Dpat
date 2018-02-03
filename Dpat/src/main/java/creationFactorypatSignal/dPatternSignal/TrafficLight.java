package creationFactorypatSignal.dPatternSignal;

public class TrafficLight extends TrafficSignal{

	@Override
	public String getMessage() {
		switch(state){
		 case STOP: return "Stop";
		 case GO: return "Go";
		 case CAUTION: return "Wait";
		 default: return "invalid arg";
		}
	}

}
