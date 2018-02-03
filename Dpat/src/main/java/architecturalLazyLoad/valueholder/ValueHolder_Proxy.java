package architecturalLazyLoad.valueholder;

public class ValueHolder_Proxy<T> {
	private T _value;
	private IValueLoader<T> _loader;
	
	public ValueHolder_Proxy(IValueLoader<T> loader){
		_loader=loader;
	}
	
	public T getValue(){
		if(_value==null)
			_value=_loader.Load();
		return _value;
	}
}
