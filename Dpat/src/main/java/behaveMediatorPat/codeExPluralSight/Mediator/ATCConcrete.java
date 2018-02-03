package behaveMediatorPat.codeExPluralSight.Mediator;

import java.util.ArrayList;
import java.util.List;

import behaveMediatorPat.codeExPluralSight.Aircraft.Aircraft;

public class ATCConcrete implements AirTrafficControl{
	
	private List<Aircraft> airCraftUnderGuidance=new ArrayList<Aircraft>();

	@Override
	public void receiveAircraftLoc(Aircraft craft) {
		for(Aircraft aircraft: airCraftUnderGuidance){
			if(!aircraft.equals(craft)){
				if(aircraft.getAltitude()-craft.getAltitude()<1000){
					craft.climb(2000);
					craft.warnAirspaceViolation(aircraft);
				}
			}
		}
	}

	@Override
	public void registerAircraftUnderGuidance(Aircraft craft) {
		if(!airCraftUnderGuidance.contains(craft)){
			airCraftUnderGuidance.add(craft);
		}
	}

}
