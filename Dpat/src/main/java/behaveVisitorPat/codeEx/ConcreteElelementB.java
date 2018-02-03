package behaveVisitorPat.codeEx;

public class ConcreteElelementB extends ElementBase {

	@Override
	public void Accept(VisitorBase visitor) {
		visitor.Visit(this);
	}

	public String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
