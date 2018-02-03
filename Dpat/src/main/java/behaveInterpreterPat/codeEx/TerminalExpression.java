package behaveInterpreterPat.codeEx;

public class TerminalExpression extends ExpressionBase{
	
	@Override
	public void Interpret(Context con){
		System.out.println("Terminal for "+con.Name);
	}

}
