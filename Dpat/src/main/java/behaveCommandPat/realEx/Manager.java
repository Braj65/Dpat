package behaveCommandPat.realEx;

public class Manager {
	
	public static void main(String[] args){
		Robot r=new Robot();
		RobotController rc=new RobotController();
		
		MoveCommand mc=new MoveCommand(r);
		mc.forwardDistance=1000;
		rc.comm.add(mc);
		
		TakeSampleCommand tcs=new TakeSampleCommand(r);
		tcs.sample=true;
		rc.comm.add(tcs);
		
		rc.ExecuteCommands();
		rc.UndoCommands(3);
		
	}

}
