package behaveCommandPat.gofEx;

public class FanOnCommand implements Command_Base{
	private Fan myFan;
	public FanOnCommand ( Fan F) {
		myFan  =  F;
	}
	public void execute( ) {
		myFan . startRotate( );
	}
}
