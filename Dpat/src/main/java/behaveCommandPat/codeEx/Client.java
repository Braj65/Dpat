package behaveCommandPat.codeEx;

public class Client {
	
	public void runCommand(){
		Invoker in=new Invoker();
		Receiver rec=new Receiver();
		ConcreteCommand comm=new ConcreteCommand(rec);
		comm.parameter="Hello world";
		in.comm=comm;
		in.executeCommand();
	}

}
