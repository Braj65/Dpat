package behaveIteratorPat.codeExPluralsight;

import java.util.Stack;

public class DemoTreeIterator<T> implements Iterator<T>{
	
	private DemoTree<T> _tree;
	private DemoTree<T> _current;
	private DemoTree<T> _previous;
	private Stack<DemoTree<T>> _breadCrumb=new Stack<DemoTree<T>>();
	public T current;
	
	public DemoTreeIterator(DemoTree<T> tree){
		_tree=tree;
	}
	
	public void dispose(){
		
	}
	
	public boolean moveNext(){
		if(_current==null){
			reset();
			_current=_tree;
			return true;
		}
		if (_current.leftChild != null)
        {
            return traverseLeft();
        }
        if (_current.rightChild != null)
        {
            return traverseRight();
        }
        return traverseUpAndRight();
	}
	
    private boolean traverseUpAndRight()
    {
        if (_breadCrumb.size() > 0)
        {
            _previous = _current;
            while (true)
            {
                _current = _breadCrumb.pop();
                if (_previous != _current.rightChild) break;
            }
            if (_current.rightChild != null)
            {
                _breadCrumb.push(_current);
                _current = _current.rightChild;
                return true;
            }
        }
        return false;
    }
    
    private boolean traverseLeft()
    {
        _breadCrumb.push(_current);
        _current = _current.leftChild;
        return true;
    }
    
    private boolean traverseRight()
    {
        _breadCrumb.push(_current);
        _current = _current.rightChild;
        return true;
    }
    
    public void reset()
    {
        _current = null;
    }

	@Override
	public Iterator<T> getIterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
