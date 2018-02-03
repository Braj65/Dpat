package structuralDecoratorPat.codeEx;

public abstract class DecoratorBase extends ComponentBase{
	public final ComponentBase comp;
	
	public DecoratorBase(ComponentBase comp){
		this.comp=comp;
	}
	
	@Override
	public void Operation(){
		comp.Operation();
	}

}
