package behaveObserverPat.codeEx;

import java.util.ArrayList;
import java.util.List;

public abstract class SubjectBase {
	private List<ObserverBase> obs=new ArrayList<ObserverBase>();
	
	public void attach(ObserverBase o){
		obs.add(o);
	}
	
	public void detach(ObserverBase o){
		obs.remove(o);
	}
	
	public void Notify(){
		for(ObserverBase p:obs){
			p.update();
		}
	}
}
