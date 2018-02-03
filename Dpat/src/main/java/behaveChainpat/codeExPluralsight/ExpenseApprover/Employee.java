package behaveChainpat.codeExPluralsight.ExpenseApprover;

import behaveChainpat.codeExPluralsight.ExpenseReport.ExpenseReport;

public class Employee implements ExpenseApprover{
	String name;
	int approvalLimit;
	ExpenseApprover manager=EndOfChainApprover.getInstance();
	
	public Employee(String name, int approvalLimit){
		this.name=name;
		this.approvalLimit=approvalLimit;
	}
	
	public ApprovalResponse approveExpense(ExpenseReport report) {
		return report.total()>approvalLimit?
				manager.approveExpense(report):ApprovalResponse.APPROVED;
		
	}

	@Override
	public void registerManager(ExpenseApprover employee) {
		manager=employee;
	}
	

}
