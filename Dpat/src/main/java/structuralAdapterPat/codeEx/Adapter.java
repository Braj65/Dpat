package structuralAdapterPat.codeEx;

public class Adapter implements ITarget{

	public final Adaptee adapt=new Adaptee();
	@Override
	public void methodA(){
		adapt.methodB();
	}
}
