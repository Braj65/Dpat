package behaveStatePat.codeEx;

public class Manager {
	public static void main(String[] args){
		Context c=new Context(new ConcreteStateA());
		c.request();
		c.request();
		c.request();
	}
}
