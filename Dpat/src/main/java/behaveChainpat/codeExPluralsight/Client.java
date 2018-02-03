package behaveChainpat.codeExPluralsight;

import java.util.ArrayList;
import java.util.List;

import behaveChainpat.codeExPluralsight.ExpenseApprover.ApprovalResponse;
import behaveChainpat.codeExPluralsight.ExpenseApprover.Employee;
import behaveChainpat.codeExPluralsight.ExpenseApprover.ExpenseApprover;
import behaveChainpat.codeExPluralsight.ExpenseReport.ExpenseReport;
import behaveChainpat.codeExPluralsight.ExpenseReport.ExpenseReportConcrete;

public class Client {
	
	public static void main(String[] args) {
		ExpenseApprover emp1=new Employee("William", 0);
		ExpenseApprover emp2=new Employee("Mary", 1000);
		ExpenseApprover emp3=new Employee("Victor", 5000);
		ExpenseApprover emp4=new Employee("Paula", 20000);
		
		emp1.registerManager(emp2);
		emp2.registerManager(emp3);
		emp3.registerManager(emp4);
		
		
		ExpenseReport report=new ExpenseReportConcrete(27000);
		ApprovalResponse resp=emp1.approveExpense(report);
		System.out.println("Expense Approval status: "+resp);
	}

}
