package behaveInterpreterPat.realEx;

public class IntegerExpression extends IExpressionBase{

	public int x;
	public IntegerExpression(int val){
		x=val;
	}
	
	@Override
	public int Evaluate() {
		return x;	
	}
	
	@Override
	public String toString(){
		return String.valueOf(x);
	}

}
