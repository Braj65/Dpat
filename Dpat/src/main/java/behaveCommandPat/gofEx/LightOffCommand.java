package behaveCommandPat.gofEx;

public class LightOffCommand implements Command_Base{
	private Light_Receiver myLight;
	public LightOffCommand ( Light_Receiver L) {
		myLight  =  L;
	}
	public void execute( ) {
		myLight . turnOff( );
	}
}
