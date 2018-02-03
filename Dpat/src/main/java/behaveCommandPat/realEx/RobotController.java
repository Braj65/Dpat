package behaveCommandPat.realEx;

import java.util.ArrayList;
import java.util.List;

public class RobotController {
	
	public List<RobotCommandBase> comm=new ArrayList<RobotCommandBase>();
	public List<RobotCommandBase> stk=new ArrayList<RobotCommandBase>();
	
	public void ExecuteCommands(){
		System.out.println("Executing comms");
		
		while(comm.size()>0){
			RobotCommandBase com=comm.get(0);
			com.Execute();
			stk.add(com);
		}
		
	}
	
	public void UndoCommands(int numUndos){
		System.out.println("Reversing 0 commands"+ numUndos);
		while(numUndos>0 && stk.size()>0){
			RobotCommandBase c=stk.get(0);
			c.Undo();
			numUndos--;
		}
	}

	
}
