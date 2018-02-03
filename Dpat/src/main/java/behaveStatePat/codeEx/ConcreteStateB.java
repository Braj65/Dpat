package behaveStatePat.codeEx;

public class ConcreteStateB extends StateBase {

	@Override
	public void Handle(Context context) {
		context.s2=new ConcreteStateA();
	}

}
