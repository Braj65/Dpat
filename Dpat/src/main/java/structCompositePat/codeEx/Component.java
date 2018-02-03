package structCompositePat.codeEx;

public abstract class Component {
	public final String name;
	
	public Component(String name){
		this.name=name;
	}
	
	
	public abstract void operation();
	public abstract void Display(int Depth);
}
