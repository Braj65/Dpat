package behaveMediatorPat.realEx;

import java.util.ArrayList;
import java.util.List;

public class RegionalAirTrafficControl implements IAirTrafficControl{

	public List<Aircraft> crafts=new ArrayList<Aircraft>();
	@Override
	public void registrerAircraft(Aircraft air) {
		if(!crafts.contains(air))
			crafts.add(air);
		
	}

	@Override
	public void sendWarningMsg(Aircraft air) {
		for(Aircraft r:crafts){
			r.receiveWarning(air);
		}
		
	}

}
