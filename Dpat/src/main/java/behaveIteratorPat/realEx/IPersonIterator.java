package behaveIteratorPat.realEx;

public abstract class IPersonIterator {
	public IPersonEnumerable per;
	public abstract void moveFirst() throws Exception;
	public abstract boolean moveNext();
	public abstract Person curr() throws Exception;
}
