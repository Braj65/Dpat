package structCompositePat.codeEx;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
	private final List<Component> _children=new ArrayList<Component>();
	
	public Composite(String name){
		super(name);
	}
	
	public void AddChild(Component component){
		_children.add(component);
	}
	public void RemoveChild(Component component){
		_children.remove(component);
	}

	@Override
	public void operation() {
		System.out.println(_children.size());		
	}

	@Override
	public void Display(int Depth) {
		System.out.println(" "+Depth+" "+name);
		
		for(Component comp:_children){
			comp.Display(Depth+2);
		}
	}

}
