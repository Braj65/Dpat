package behaveObserverPat.codeExPluralsight.eventDelegate;

import behaveObserverPat.codeExPluralsight.eventDelegate.broadcast.BroadOneImpl;
import behaveObserverPat.codeExPluralsight.eventDelegate.broadcast.Broadcaster;
import behaveObserverPat.codeExPluralsight.eventDelegate.observer.ObsOneImpl;
import behaveObserverPat.codeExPluralsight.eventDelegate.observer.Observer;

public class Client {
	public static void main(String[] args) {
		Broadcaster caster=new BroadOneImpl();
		Observer obs=new ObsOneImpl(caster);
		
		caster.setValue();
		
	}

}
