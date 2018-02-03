package behaveInterpreterPat.codeExPluralSight;

import java.util.ArrayList;
import java.util.List;

import behaveInterpreterPat.codeExPluralSight.Expression.Context;
import behaveInterpreterPat.codeExPluralSight.Expression.NonTerminal_CompositeExpression.CondimentList;
import behaveInterpreterPat.codeExPluralSight.Expression.NonTerminal_CompositeExpression.IngredientList;
import behaveInterpreterPat.codeExPluralSight.Expression.NonTerminal_CompositeExpression.Sandwich;
import behaveInterpreterPat.codeExPluralSight.Expression.TerminalExpression.Bread;
import behaveInterpreterPat.codeExPluralSight.Expression.TerminalExpression.BreadWheat;
import behaveInterpreterPat.codeExPluralSight.Expression.TerminalExpression.Condiment;
import behaveInterpreterPat.codeExPluralSight.Expression.TerminalExpression.CondimentMustard;
import behaveInterpreterPat.codeExPluralSight.Expression.TerminalExpression.Ingredient;
import behaveInterpreterPat.codeExPluralSight.Expression.TerminalExpression.TomatoIngredient;

public class Client {
	
	public static void main(String[] args) {
		Bread topBread=new BreadWheat();
		Bread bottomBread=new BreadWheat();
		
		Condiment topCondiment=new CondimentMustard();
		Condiment bottomCondiment=new CondimentMustard();
		List<Condiment> topList=new ArrayList<Condiment>();
		topList.add(topCondiment);
		CondimentList topCondiList=new CondimentList(topList);
		List<Condiment> bottomList=new ArrayList<Condiment>();
		bottomList.add(bottomCondiment);
		CondimentList bottomCondiList=new CondimentList(bottomList);
		
		Ingredient ingredient=new TomatoIngredient();
		List<Ingredient> ingList=new ArrayList<Ingredient>();
		ingList.add(ingredient);
		IngredientList ingredients=new IngredientList(ingList);
		
		Sandwich sandwich=new Sandwich(topBread, topCondiList, ingredients, 
				bottomCondiList, bottomBread);
		sandwich.interpret(new Context());
	}

}
