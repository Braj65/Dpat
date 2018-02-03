package behaveCommandPat.realEx;

public abstract class RobotCommandBase {
	public Robot rob;
	
	public abstract void Execute();
	public abstract void Undo();
	
	public RobotCommandBase(Robot r){
		rob=r;
	}

}
