package behaveChainpat.codeExPluralsight.ExpenseApprover;

public enum ApprovalResponse {
	DENIED, APPROVED, BEYONDAPPROVALLIMIT;
	
	public String toString(){
		switch(this){
		case DENIED:
			return "Denied";
		case APPROVED:
			return "Approved";
		case BEYONDAPPROVALLIMIT:
			return "BeyondLimit";
			default:
				return "";
		}
	}
}
