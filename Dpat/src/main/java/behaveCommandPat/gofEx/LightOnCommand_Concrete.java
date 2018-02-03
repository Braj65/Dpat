package behaveCommandPat.gofEx;

public class LightOnCommand_Concrete implements Command_Base{
	private Light_Receiver myLight;
	public LightOnCommand_Concrete ( Light_Receiver L) {
		myLight  =  L;
	}
	public void execute( ) {
		myLight . turnOn( );
	}
}
