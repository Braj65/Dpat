package behaveVisitorPat.realEx;

import java.util.ArrayList;
import java.util.List;

public class Car implements IElementBase{
	
	private List<IElementBase> parts;
	
	public Car(){
		parts=new ArrayList<IElementBase>();
	}
	
	public void Attach(IElementBase i){
		parts.add(i);
	}
	
	public void Remove(IElementBase e){
		parts.remove(e);
	}

	@Override
	public void Accept(IVisitorBase visitor) {
		for(IElementBase i:parts){
			i.Accept(visitor);
		}
	}
	
}
