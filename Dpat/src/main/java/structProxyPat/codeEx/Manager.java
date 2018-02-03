package structProxyPat.codeEx;

public class Manager {
	
	public static void main(String[] args){
		SubjectBase bae=new RealSubject();
		Proxy p=new Proxy(bae);
		p.Operation();
	}

}
