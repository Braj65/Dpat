package behaveObserverPat.codeExPluralsight.eventDelegate.broadcast;

public class BroadOneImpl extends Broadcaster{
	
	public void setValue(){
		this.notifyObservers();
	}
}
