package behaveMediatorPat.codeExPluralSight;

import behaveMediatorPat.codeExPluralSight.Aircraft.Airbus;
import behaveMediatorPat.codeExPluralSight.Aircraft.Aircraft;
import behaveMediatorPat.codeExPluralSight.Aircraft.Embraer190;
import behaveMediatorPat.codeExPluralSight.Mediator.ATCConcrete;
import behaveMediatorPat.codeExPluralSight.Mediator.AirTrafficControl;

public class Client {
	
	public static void main(String[] args) {
		AirTrafficControl atc=new ATCConcrete();
		
		Aircraft air1=new Airbus("AC159", atc);
		Aircraft air2=new Embraer190("AC162", atc);
		
		air1.setAltitude(2000);
	}

}
