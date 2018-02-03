package behaveInterpreterPat.realEx;

public class Manager {
	
	public static void main(String[] args){
		Parser p=new Parser();
		
		String[] com={"+ 5 6", "- 6 5"};
		for(String c:com){
			IExpressionBase i=p.Parse(c);
			System.out.println("res of "+i+" "+i.Evaluate());
		}
	}

}
