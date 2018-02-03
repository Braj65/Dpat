package structCompositePat.realEx;

import java.util.ArrayList;
import java.util.List;

public class ComplexShape implements IShape{

	private List<IShape> _shapes=new ArrayList<IShape>();
	
	public void addShape(IShape s){
		_shapes.add(s);
	}
	
	public void removeShape(IShape s){
		_shapes.remove(s);
	}
	
	@Override
	public void Render() {
		for(IShape x:_shapes){
			x.Render();
		}
		
	}

}
