package behaveIteratorPat.codeExPluralsight;

import java.util.ArrayList;
import java.util.List;

public class DemoTree<T> implements Iterator<T>{
	public T value;
	public DemoTree<T> leftChild;
	public DemoTree<T> rightChild;
	public boolean useBreadthFirstEnumerator;
	
	public DemoTree(T val){
		this.value=val;
	}
	
	public void add(T val){
		if(leftChild==null){
			leftChild=new DemoTree<T>(value);
			return;
		}
		if(rightChild==null){
			rightChild=new DemoTree<T>(value);
			return;
		}
		if(leftChild.depth()<=rightChild.depth()){
			leftChild.add(value);
			return;
		}
		rightChild.add(value);
	}
	
	public List<T> toList(){
		List<T> myList=new ArrayList<T>();
		myList.add(value);
		if(leftChild!=null){
			myList.addAll(leftChild.toList());
		}
		if(rightChild!=null){
			myList.addAll(rightChild.toList());
		}
		return myList;
	}
	
	public int depth(){
		if(leftChild==null || rightChild==null)
			return 0;
		return 1+Math.max(leftChild.depth(), rightChild.depth());
	}
	
	public Iterator<DemoTree<T>> children(){
		/*if(leftChild!=null){
			return leftChild;
		}
		if(rightChild!=null)
			return rightChild;*/
		return null;
	}

	@Override
	public Iterator<T> getIterator() {
		if(useBreadthFirstEnumerator){
			return new DemoTreeBreadthIterator<T>(this);
		}
		return new DemoTreeIterator<T>(this);
	}
}
