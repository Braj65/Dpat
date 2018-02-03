package behaveMediatorPat.codeExPluralSight.Mediator;

import behaveMediatorPat.codeExPluralSight.Aircraft.Aircraft;

public interface AirTrafficControl {
	void receiveAircraftLoc(Aircraft craft);
	void registerAircraftUnderGuidance(Aircraft craft);

}
