package behaveVisitorPat.codeEx;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<ElementBase> elements;
	
	public ObjectStructure(){
		elements=new ArrayList<ElementBase>();
	}
	
	public void Accept(VisitorBase visitor){
		for(ElementBase e:elements){
			e.Accept(visitor);
		}
	}
	
	public void Attach(ElementBase ele){
		elements.add(ele);
	}
	
	public void Detach(ElementBase ele){
		elements.remove(ele);
	}
}
