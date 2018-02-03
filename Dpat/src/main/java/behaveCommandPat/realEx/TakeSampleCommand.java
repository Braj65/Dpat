package behaveCommandPat.realEx;

public class TakeSampleCommand extends RobotCommandBase{
	
	public boolean sample;
	public TakeSampleCommand(Robot r) {
		super(r);
	}

	@Override
	public void Execute() {
		rob.takeSample(true);
		
	}

	@Override
	public void Undo() {
		rob.takeSample(false);
		
	}

}
