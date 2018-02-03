package structProxyPat.codeEx;

public class Proxy extends SubjectBase{
	private SubjectBase sub;
	
	public Proxy(SubjectBase bae){
		sub=bae;
	}
	
	@Override
	public void Operation() {
		sub.Operation();
		
	}

}
