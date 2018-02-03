package creationFactorypatSignal.dPatternSignal;

public class WalkSign extends TrafficSignal{

	@Override
	public String getMessage() {
		switch(state){
		case STOP: return "Don't walk";
		case GO: return "Walk";
		case CAUTION: return "Wait";
		default: return "illegal state";
		}
	}

}
