package behaveCommandPat.gofEx;

public class FanOffCommand implements Command_Base{
	private Fan myFan;
	public FanOffCommand ( Fan F) {
		myFan  =  F;
	}
	public void execute( ) {
		myFan . stopRotate( );
	}
}
