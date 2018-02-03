package structureHybrid.DecoratorBuilderOP.OPool;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class ObjectPool<T> {
	private long expirationTime;
	private Map<T, Long> locked, unlocked;
	
	public ObjectPool(){
		expirationTime=300000;
		locked=new HashMap<T, Long>();
		unlocked=new HashMap<T, Long>();
	}
	
	public abstract boolean validate(T t);
	public abstract T create();
	public abstract void expire(T t);
	
	public T checkout(){
		long now=System.currentTimeMillis();
		T t;
		if(unlocked.size()>0){
			Set<T> set=unlocked.keySet();
			Iterator<T> iter=set.iterator();
			while(iter.hasNext()){
				t=iter.next();
				if(now-unlocked.get(t)>expirationTime){
					unlocked.remove(t);
					expire(t);
					t=null;
				}else{
					if(validate(t)){
						locked.put(t, now);
						unlocked.remove(t);
						return t;
					}else{
						//object failed validation
						unlocked.remove(t);
						expire(t);
						t=null;
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
