package behaveObserverPat.codeExPluralsight.traditional.broadcast;

public class BroadOneImpl extends Broadcaster{
	
	public void setValue(){
		this.notifyObservers();
	}
}
