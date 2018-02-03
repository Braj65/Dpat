package behaveInterpreterPat.codeExPluralSight.Expression.TerminalExpression;

import behaveInterpreterPat.codeExPluralSight.Expression.Context;

public class CondimentMustard implements Condiment{

	@Override
	public void interpret(Context context) {
		context.output+=" Mustard ";		
	}

}
