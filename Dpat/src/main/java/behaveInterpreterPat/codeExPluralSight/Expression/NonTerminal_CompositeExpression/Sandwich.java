package behaveInterpreterPat.codeExPluralSight.Expression.NonTerminal_CompositeExpression;

import behaveInterpreterPat.codeExPluralSight.Expression.Context;
import behaveInterpreterPat.codeExPluralSight.Expression.ExpressionBase;
import behaveInterpreterPat.codeExPluralSight.Expression.TerminalExpression.Bread;

public class Sandwich implements ExpressionBase{
	
	private Bread topBread;
	private CondimentList topCondiments;
	private IngredientList ingredientsList;
	private CondimentList bottomCondiments;
	private Bread bottomBread;
	
	public Sandwich(Bread topBread, CondimentList topCondiments,
			IngredientList ingredientsList, CondimentList bottomCondiments, Bread bottomBread){
		this.topBread=topBread;
		this.topCondiments=topCondiments;
		this.ingredientsList=ingredientsList;
		this.bottomCondiments=bottomCondiments;
		this.bottomBread=bottomBread;
	}

	@Override
	public void interpret(Context context) {
		context.output+="|";
		topBread.interpret(context);
		context.output+="|";
		context.output+="<--";
		topCondiments.interpret(context);
		context.output+="-";
		ingredientsList.interpret(context);
		context.output+="-";
		bottomCondiments.interpret(context);
		context.output+="-->";
		context.output+="|";
		bottomBread.interpret(context);
		context.output+="|";
		System.out.println(context.output);
		
	}

}
