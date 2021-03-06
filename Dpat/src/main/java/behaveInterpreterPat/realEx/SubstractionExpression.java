package behaveInterpreterPat.realEx;

public class SubstractionExpression extends IExpressionBase{

	public IntegerExpression i1;
	public IntegerExpression i2;
	
	public SubstractionExpression(IntegerExpression i1, IntegerExpression i2){
		this.i1=i1;
		this.i2=i2;
	}
	
	@Override
	public int Evaluate() {
		int val1=i1.Evaluate();
		int val2=i2.Evaluate();
		
		return val1-val2;
	}
	
	@Override
	public String toString(){
		return String.valueOf("Substracted "+i1+" "+i2);
				
	}



}
