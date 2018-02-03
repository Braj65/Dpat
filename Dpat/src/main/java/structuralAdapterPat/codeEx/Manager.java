package structuralAdapterPat.codeEx;

public class Manager {
	public static void main(String[] args){
		Adapter ad=new Adapter();
		Client ct=new Client(ad);
		ct.request();
	}

}
