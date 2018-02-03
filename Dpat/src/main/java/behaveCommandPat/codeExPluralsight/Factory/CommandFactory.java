package behaveCommandPat.codeExPluralsight.Factory;

import behaveCommandPat.codeExPluralsight.Command.Command;

public interface CommandFactory {
	Command makeCommand(String comm);
	String getCommandName();
	String getDescription();
}
