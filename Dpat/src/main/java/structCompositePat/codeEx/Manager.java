package structCompositePat.codeEx;

public class Manager {
	public static void main(String[] args){
		Composite comp=new Composite("Root");
		comp.AddChild(new Leaf("Leaf 1"));
		comp.AddChild(new Leaf("Leaf 2"));
		
		Composite comp2=new Composite("Composite c");
		comp2.AddChild(new Leaf("Leaf C.1"));
		comp2.AddChild(new Leaf("Leaf C.2"));
		
		comp.AddChild(comp2);
		comp.AddChild(new Leaf("Leaf 3"));
		
		Leaf l=new Leaf("leaf 4");
		comp.AddChild(l);
		comp.RemoveChild(l);
		
		comp.Display(1);
	}
}
