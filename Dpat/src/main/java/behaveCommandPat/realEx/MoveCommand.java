package behaveCommandPat.realEx;

public class MoveCommand extends RobotCommandBase{

	public int forwardDistance;
	
	public MoveCommand(Robot r) {
		super(r);
	}

	@Override
	public void Execute() {
		rob.Move(forwardDistance);
		
	}

	@Override
	public void Undo() {
		rob.Move(-forwardDistance);
		
	}

}
