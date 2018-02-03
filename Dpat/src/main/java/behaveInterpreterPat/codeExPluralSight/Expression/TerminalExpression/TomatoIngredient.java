package behaveInterpreterPat.codeExPluralSight.Expression.TerminalExpression;

import behaveInterpreterPat.codeExPluralSight.Expression.Context;

public class TomatoIngredient implements Ingredient{

	@Override
	public void interpret(Context context) {
		context.output+=" Tomato ";		
	}

}
