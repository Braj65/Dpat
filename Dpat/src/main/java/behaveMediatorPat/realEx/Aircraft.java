package behaveMediatorPat.realEx;

public abstract class Aircraft {
	private final IAirTrafficControl atc;
	private int alti;

	public String registrationNum;
	
	public Aircraft(String regnum, IAirTrafficControl c){
		atc=c;
		registrationNum=regnum;
		atc.registrerAircraft(this);
	}
	
	public int getAlti() {
		return alti;
	}

	public void setAlti(int alti) {
		this.alti = alti;
		atc.sendWarningMsg(this);
		
	}
	
	public void receiveWarning(Aircraft ar){
		System.out.println("To flight "+this.registrationNum+" from flight "+ar.registrationNum);
	}
}
