package behaveChainpat.codeEx;

public class ConcreteHandlerB extends HandlerBase{

	@Override
	public void HandleRequest(int request) {
		if(request>1)
			System.out.println("Handled by concretehandler B");
		else
			bae.HandleRequest(request);		
	}

}
