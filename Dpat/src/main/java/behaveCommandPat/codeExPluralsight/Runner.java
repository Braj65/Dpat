package behaveCommandPat.codeExPluralsight;

import java.util.ArrayList;
import java.util.List;

import behaveCommandPat.codeExPluralsight.Command.Command;
import behaveCommandPat.codeExPluralsight.Command.CreateOrderCommand;
import behaveCommandPat.codeExPluralsight.Command.ShipOrderCommand;
import behaveCommandPat.codeExPluralsight.Command.UpdateQtyCommand;
import behaveCommandPat.codeExPluralsight.Factory.CommandFactory;
import behaveCommandPat.codeExPluralsight.Factory.CommandParser;

public class Runner {
	
	public static void run(String command){
		List<CommandFactory> availableCommands=getAvailableCommands();
		
		if(command==""){
			printUsage(availableCommands);
			return;
		}
		 CommandParser parser=new CommandParser(availableCommands);
		 Command fecthedComm=parser.parseCommand(command);
		 fecthedComm.execute();
	}
	
	public static List<CommandFactory> getAvailableCommands(){
		List<CommandFactory> list=new ArrayList<CommandFactory>();
		list.add(new UpdateQtyCommand());
		list.add(new CreateOrderCommand());
		list.add(new ShipOrderCommand());
		return list;
	}
	
	public static void printUsage(List<CommandFactory> availableCommands){
		System.out.println("Commands:");
		for(CommandFactory c:availableCommands){
			System.out.println("Desc: "+c.getDescription());
		}
	}

}
