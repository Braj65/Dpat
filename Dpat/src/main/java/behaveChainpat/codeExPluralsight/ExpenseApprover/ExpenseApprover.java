package behaveChainpat.codeExPluralsight.ExpenseApprover;

import behaveChainpat.codeExPluralsight.ExpenseReport.ExpenseReport;

public interface ExpenseApprover {
	
	ApprovalResponse approveExpense(ExpenseReport report);
	void registerManager(ExpenseApprover employee);

}
