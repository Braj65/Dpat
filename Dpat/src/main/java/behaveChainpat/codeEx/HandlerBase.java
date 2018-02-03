package behaveChainpat.codeEx;

public abstract class HandlerBase {
	
	public HandlerBase bae;
	
	public abstract void HandleRequest(int request);
	
	public void setSuccessor(HandlerBase bae){
		this.bae=bae;	
	}

}
