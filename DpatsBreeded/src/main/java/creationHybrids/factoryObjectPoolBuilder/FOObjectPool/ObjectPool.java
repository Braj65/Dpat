package creationHybrids.factoryObjectPoolBuilder.FOObjectPool;

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
	
	public abstract void expire(T o);
	public abstract boolean validate(T o);
	public abstract T create();
	
	public T checkout(){
		long now=System.currentTimeMillis();
		T t;
		if(unlocked.size()>0){
			Set entries=unlocked.keySet();
			Iterator iter=entries.iterator();
			while(iter.hasNext()){
				t=(T) iter.next();
				
				if(now-unlocked.get(t)>expirationTime){
					unlocked.remove(t);
					expire(t);
					t=null;
				}else{
					if(validate(t)){
						locked.put(t, now);
						unlocked.remove(t);
						return t;
					}else{/*
						//Object failed validation
						unlocked.remove(t);
						expire(t);
						t=null;
					*/}
				}
			}
		}
		//no objects available create a new one
		t=create();
		locked.put(t, now);
		return t;
	}
	

	public void checkin(T t){
		locked.remove(t);
		unlocked.put(t, System.currentTimeMillis());
	}

}
