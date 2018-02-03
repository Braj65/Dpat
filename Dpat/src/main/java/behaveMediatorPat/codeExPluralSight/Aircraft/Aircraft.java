package behaveMediatorPat.codeExPluralSight.Aircraft;

import behaveMediatorPat.codeExPluralSight.Mediator.AirTrafficControl;

public abstract class Aircraft {
	private String callSign;
	private AirTrafficControl atc;
	private int currentAltitude;
	
	public Aircraft(String callSign, AirTrafficControl atc){
		this.callSign=callSign;
		this.atc=atc;
		atc.registerAircraftUnderGuidance(this);
	}
	
	public abstract int ceiling();
	
	public int getAltitude(){
		return currentAltitude;
	}
	
	public void setAltitude(int val){
		currentAltitude=val;
		atc.receiveAircraftLoc(this);
	}
	
	public void climb(int newHeight){
		setAltitude(newHeight);
	}
	
	public void warnAirspaceViolation(Aircraft craft){
		
	}
	
	
	public boolean equals(Object obj){
		if(obj instanceof Aircraft){
			Aircraft air=(Aircraft) obj;
			return (callSign.equals(air.callSign));
		}
		return false;
	}
	
	public int getHashCode(){
		return callSign.hashCode();
	}
	
}
