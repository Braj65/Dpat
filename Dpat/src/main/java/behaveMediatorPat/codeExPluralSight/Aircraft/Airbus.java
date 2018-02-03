package behaveMediatorPat.codeExPluralSight.Aircraft;

import behaveMediatorPat.codeExPluralSight.Mediator.AirTrafficControl;

public class Airbus extends Aircraft{
	
	public Airbus(String callSign, AirTrafficControl atc){
		super(callSign, atc);
	}
	
	public int ceiling(){
		return 35000;
	}

}
