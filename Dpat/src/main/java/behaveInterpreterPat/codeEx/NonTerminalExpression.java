package behaveInterpreterPat.codeEx;

public class NonTerminalExpression extends ExpressionBase{
	
	public ExpressionBase e1;
	public ExpressionBase e2;

	@Override
	public void Interpret(Context con) {
		System.out.println("non terminal expr "+con.Name);
		e1.Interpret(con);
		e2.Interpret(con);
	}

}
