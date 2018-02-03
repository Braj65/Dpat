package behaveCommandPat.codeExPluralsight.Command;

import behaveCommandPat.codeExPluralsight.Factory.CommandFactory;

public class UpdateQtyCommand implements Command, CommandFactory{
	public int newQty;
	public final int oldQty=5;
	
	public String CommandName="UpdateQty";
	public String Description;
	
	@Override
	public void execute() {
		System.out.println("Updated order qty from "+oldQty+" to new qty "+getNewQty());
	}
	
	public void setNewQty(int qty){
		newQty=qty;
	}
	
	public int getNewQty(){
		return newQty;
	}

	@Override
	public Command makeCommand(String arg) {
		UpdateQtyCommand comm= new UpdateQtyCommand();
		comm.setNewQty(Integer.parseInt(arg));
		return comm;
	}
	
	public String getCommandName(){
		return CommandName;
	}
	
	public String getDescription(){
		return "UpdateQuantity Number";
	}

}
