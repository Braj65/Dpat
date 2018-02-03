package behaveInterpreterPat.codeEx;

public class Clent {
	
	public static void buildAndInterpretCommands(){
		Context con=new Context("hello world");
		TerminalExpression e3=new TerminalExpression();
		TerminalExpression e4=new TerminalExpression();
		NonTerminalExpression e=new NonTerminalExpression();
		e.e1=e3;
		e.e2=e4;
		e.Interpret(con);		
	}

}
