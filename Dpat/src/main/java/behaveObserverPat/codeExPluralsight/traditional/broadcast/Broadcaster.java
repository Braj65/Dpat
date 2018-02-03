package behaveObserverPat.codeExPluralsight.traditional.broadcast;

import java.util.ArrayList;
import java.util.List;

import behaveObserverPat.codeExPluralsight.traditional.observer.Observer;

public abstract class Broadcaster {
	public int price;
	public String symbol;
	List<Observer> observers=new ArrayList<Observer>();
	
	public abstract void setValue();
	
	public void register(Observer obs){
		observers.add(obs);
	}
	
	public void unregister(Observer obs){
		observers.remove(obs);
	}
	
	public void notifyObservers(){
		for(Observer o:observers){
			o.update();
		}
	}

}
