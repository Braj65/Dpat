package behaveChainpat.codeExPluralsight.ExpenseReport;

public class ExpenseReportConcrete implements ExpenseReport{
	public int total;
	
	public ExpenseReportConcrete(int tot) {
		this.total=tot;
	}
	

	@Override
	public int total() {
		return total;
	}
	
	private void setTotal(){}

}
