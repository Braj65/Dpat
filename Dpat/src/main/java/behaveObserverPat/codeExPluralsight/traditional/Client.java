package behaveObserverPat.codeExPluralsight.traditional;

import behaveObserverPat.codeExPluralsight.traditional.broadcast.BroadOneImpl;
import behaveObserverPat.codeExPluralsight.traditional.broadcast.Broadcaster;
import behaveObserverPat.codeExPluralsight.traditional.observer.ObsOneImpl;
import behaveObserverPat.codeExPluralsight.traditional.observer.Observer;

public class Client {
	public static void main(String[] args) {
		Broadcaster caster=new BroadOneImpl();
		Observer obs=new ObsOneImpl(caster);
		
		caster.setValue();
		
	}

}
