package behaveInterpreterPat.codeExPluralSight.Expression.TerminalExpression;

import behaveInterpreterPat.codeExPluralSight.Expression.Context;

public class BreadWheat implements Bread{

	@Override
	public void interpret(Context context) {
		context.output+=" Wheat Bread";		
	}

}
