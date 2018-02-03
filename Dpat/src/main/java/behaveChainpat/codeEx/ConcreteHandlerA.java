package behaveChainpat.codeEx;

public class ConcreteHandlerA extends HandlerBase{

	@Override
	public void HandleRequest(int request) {
		if(request==1)
			System.out.println("Handled by Concretehandler A");
		else
			bae.HandleRequest(request);
		
	}

}
