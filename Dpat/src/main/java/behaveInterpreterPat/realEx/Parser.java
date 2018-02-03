package behaveInterpreterPat.realEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {
	
	public IExpressionBase Parse(String polish){
		String[] x=polish.split(" ");
		List<String> pol=Arrays.asList(x);
		
		return ParseNextExpression(pol);
	}
	
	public IExpressionBase ParseNextExpression(List<String> symbols){
		int val;
		val=Integer.valueOf(symbols.get(0));
		if(val!=0){
			symbols.remove(0);
			return new IntegerExpression(val);
		}
		return ParseNonTerminalExpression(symbols);
	}
	
	public IExpressionBase ParseNonTerminalExpression(List<String> symbols){
		String sym=symbols.get(0);
		symbols.remove(0);
		
		IntegerExpression i1=(IntegerExpression) ParseNextExpression(symbols);
		IntegerExpression i2=(IntegerExpression) ParseNextExpression(symbols);
		
		switch(sym){
		case "+":
			return new AdditionExpression(i1, i2);
		case "-":
			return new SubstractionExpression(i1, i2);
		default:
			return new AdditionExpression(i1, i2);
		}
		
		
	}
	

}
