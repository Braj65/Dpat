package behaveCommandPat.gofEx;

public class Client {
	public static void main(String[] args) {
		Light_Receiver  testLight = new Light_Receiver( );
		LightOnCommand_Concrete testLOC = new LightOnCommand_Concrete(testLight);
		LightOffCommand testLFC = new LightOffCommand(testLight);
		Switch_Invoker testSwitch = new Switch_Invoker( testLOC,testLFC);       
		testSwitch.flipUp( );
		testSwitch.flipDown( );
		Fan testFan = new Fan( );
		FanOnCommand foc = new FanOnCommand(testFan);
		FanOffCommand ffc = new FanOffCommand(testFan);
		Switch_Invoker ts = new Switch_Invoker( foc,ffc);
		ts.flipUp( );
		ts.flipDown( ); 
	}
}
