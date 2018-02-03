package behaveCommandPat.codeEx;


public class ConcreteCommand extends CommandBase{
	public String parameter;
	
	public ConcreteCommand(Receiver rece){
		super(rece);
	}
	
	@Override
	public void Execute(){
		_receiver.Action(parameter);
	}

}
