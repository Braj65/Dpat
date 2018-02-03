package behaveMediatorPat.realEx;

public class Manager {
	public static void main(String[] args){
		RegionalAirTrafficControl c=new RegionalAirTrafficControl();
		Airbus380 a=new Airbus380("AI380", c);
		Boeing747 b=new Boeing747("B747", c);
		c.sendWarningMsg(a);
	}

}
