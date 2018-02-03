package behaveChainpat.codeEx;

public class Manager {
	
	public static void main(String[] args){
		HandlerBase handA=new ConcreteHandlerA();
		HandlerBase handB=new ConcreteHandlerB();
		handA.setSuccessor(handB);
		handA.HandleRequest(1);
		handA.HandleRequest(11);
	}

}
