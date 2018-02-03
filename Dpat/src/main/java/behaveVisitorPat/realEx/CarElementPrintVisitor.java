package behaveVisitorPat.realEx;

public class CarElementPrintVisitor implements IVisitorBase{
	public void Visit(Body bod){
		System.out.println(bod.name);
	}
	
	public void Visit(Engine e){
		System.out.println(e.name);
	}
}
