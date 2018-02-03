package behaveMediatorPat.codeExPluralSight.Aircraft;

import behaveMediatorPat.codeExPluralSight.Mediator.AirTrafficControl;

public class Embraer190 extends Aircraft{
	
	public Embraer190(String callSign, AirTrafficControl atc){
		super(callSign, atc);
	}
	
	public int ceiling(){
		return 41000;
	}

}
