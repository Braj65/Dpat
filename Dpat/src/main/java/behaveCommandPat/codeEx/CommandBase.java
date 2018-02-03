package behaveCommandPat.codeEx;

public abstract class CommandBase {
	
	public final Receiver _receiver;
	
	public CommandBase(Receiver rece){
		_receiver=rece;
	}
	
	public abstract void Execute();

}
