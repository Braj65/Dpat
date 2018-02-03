package behaveStatePat.realEx;

public class DVDPlayer {
	
	private DVDPlayerState st;
	public DVDPlayerState s2;
	
	public DVDPlayer(){
		st=new StandbyState();
	}
	
	public DVDPlayer(DVDPlayerState state){
		st=state;
	}
	
	public void pressPlayButton(){
		st.PlayButtonPressed(this);
	}
	
	public void pressMenuButton(){
		st.MenuButtonPressed(this);
	}
	
	public DVDPlayerState getS2() {
		return st;
	}
	public void setS2(DVDPlayerState s2) {
		this.st = s2;
	}

}
