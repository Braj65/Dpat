package behaveCommandPat.codeExPluralsight.Command;

import behaveCommandPat.codeExPluralsight.Factory.CommandFactory;

public class CreateOrderCommand implements Command, CommandFactory{

	public String CommandName="CreateOrder";
	@Override
	public Command makeCommand(String comm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCommandName() {
		return CommandName;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}

}
