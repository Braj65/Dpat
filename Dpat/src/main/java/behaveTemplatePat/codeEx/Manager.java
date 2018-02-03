package behaveTemplatePat.codeEx;

public class Manager {
	public static void main(String[] args){
		AlgorithmBase al1=new ConcreteAlgorithmA();
		al1.templateMethod();
		AlgorithmBase al2=new ConcreteAlgorithmB();
		al2.templateMethod();
	}
}
