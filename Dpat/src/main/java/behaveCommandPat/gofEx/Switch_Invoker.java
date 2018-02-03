package behaveCommandPat.gofEx;

public class Switch_Invoker {
	private Command_Base UpCommand, DownCommand;
	public Switch_Invoker( Command_Base Up, Command_Base Down) {
	// concrete Command registers itself with the invoker
		UpCommand = Up;  
		DownCommand = Down;
	}
	/* invoker calls back concrete Command, 
	which executes the Command on the receiver */
	void flipUp( ) { 
		UpCommand . execute ( ) ;                           
	}
	void flipDown( ) {
		DownCommand . execute ( );
	}
}
