package structureHybrid.OPDecoProxyBuild.OPool;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class ObjectPool<T> {
	public abstract T create();
	public abstract boolean validate(T t);
	public abstract void expire(T t);
	
	public Map<T, Long> locked, unlocked;
	private long expirationTime;
	
	public ObjectPool(){
		locked=new HashMap<T, Long>();
		unlocked=new HashMap<T, Long>();
		expirationTime=300000;
	}
	
	public T checkout(){
		long now=System.currentTimeMillis();
		T t;
		if(unlocked.size()>0){
			Set<T> set=unlocked.keySet();
			Iterator<T> iter=set.iterator();
			while(iter.hasNext()){
				t=iter.next();
				if(now > expirationTime+unlocked.get(t)){
					expire(t);
					unlocked.remove(t);
					t=null;
				}else{
					if(validate(t)){
						locked.put(t, now);
						unlocked.remove(t);
						return t;
					}else{
						unlocked.remove(t);
						expire(t);
					}
				}
			}
		}
		t=create();
		locked.put(t, now);
		return t;
	}
	
	public void checkin(T t){
		locked.remove(t);
		unlocked.put(t, System.currentTimeMillis());
	}
}
