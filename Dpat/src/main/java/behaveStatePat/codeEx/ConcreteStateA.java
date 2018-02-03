package behaveStatePat.codeEx;

public class ConcreteStateA extends StateBase{

	@Override
	public void Handle(Context context) {
		context.s2=new ConcreteStateB();
		
	}

}
