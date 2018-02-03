package behaveChainpat.codeExPluralsight.ExpenseApprover;

import behaveChainpat.codeExPluralsight.ExpenseReport.ExpenseReport;

public class EndOfChainApprover implements ExpenseApprover{
	
	private EndOfChainApprover(){}
	private static EndOfChainApprover instance=new EndOfChainApprover();
	public static EndOfChainApprover getInstance(){
		return instance;
	}
	
	@Override
	public ApprovalResponse approveExpense(ExpenseReport report) {
		return ApprovalResponse.DENIED;
	}
	@Override
	public void registerManager(ExpenseApprover employee) {
		throw new RuntimeException("End of chain");		
	}
	
	
}
