package behaveCommandPat.codeExPluralsight.Command;

public class NotFoundCommand implements Command{

	@Override
	public void execute() {
		System.out.println("Couldn't find command");
		
	}

}
