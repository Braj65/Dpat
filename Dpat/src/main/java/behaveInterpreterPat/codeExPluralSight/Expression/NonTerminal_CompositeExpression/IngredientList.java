package behaveInterpreterPat.codeExPluralSight.Expression.NonTerminal_CompositeExpression;

import java.util.List;

import behaveInterpreterPat.codeExPluralSight.Expression.Context;
import behaveInterpreterPat.codeExPluralSight.Expression.ExpressionBase;
import behaveInterpreterPat.codeExPluralSight.Expression.TerminalExpression.Ingredient;

public class IngredientList implements ExpressionBase{
	private List<Ingredient> ingredients;
	
	public IngredientList(List<Ingredient> ingredients){
		this.ingredients=ingredients;
	}
	
	@Override
	public void interpret(Context context) {
		for(Ingredient ing:ingredients)
			ing.interpret(context);
	}

}
