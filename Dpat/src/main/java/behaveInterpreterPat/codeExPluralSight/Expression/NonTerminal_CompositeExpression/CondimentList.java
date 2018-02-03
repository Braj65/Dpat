package behaveInterpreterPat.codeExPluralSight.Expression.NonTerminal_CompositeExpression;

import java.util.List;

import behaveInterpreterPat.codeExPluralSight.Expression.Context;
import behaveInterpreterPat.codeExPluralSight.Expression.ExpressionBase;
import behaveInterpreterPat.codeExPluralSight.Expression.TerminalExpression.Condiment;

public class CondimentList implements ExpressionBase{
	private List<Condiment> condiments;
	
	public CondimentList(List<Condiment> condiments){
		this.condiments=condiments;
	}
	
	@Override
	public void interpret(Context context) {
		for(Condiment cond:condiments)
			cond.interpret(context);		
	}

}
