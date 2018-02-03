package behaveCommandPat.codeExPluralsight.Factory;

import java.util.Iterator;
import java.util.List;

import behaveCommandPat.codeExPluralsight.Command.Command;
import behaveCommandPat.codeExPluralsight.Command.NotFoundCommand;

public class CommandParser {
	
	public List<CommandFactory> availableCommands;
	public CommandParser(List<CommandFactory> availableCommands){
		this.availableCommands=availableCommands;
	}
	
	public Command parseCommand(String command){
		String requestedCommandName=command;
		CommandFactory comm=findRequestedCommand(requestedCommandName);
		if(comm==null)
			return new NotFoundCommand();
		return comm.makeCommand("12");
	}
	
	public CommandFactory findRequestedCommand(String commandName){
		Iterator<CommandFactory> iter=availableCommands.iterator();
		while(iter.hasNext()){
			CommandFactory fetchedComm=iter.next();
			if(fetchedComm.getCommandName().equals(commandName))
				return fetchedComm;
		}
		return null;
	}

}
