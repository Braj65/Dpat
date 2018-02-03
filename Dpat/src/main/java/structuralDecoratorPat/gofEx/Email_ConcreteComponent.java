package structuralDecoratorPat.gofEx;

public class Email_ConcreteComponent implements IEmail_ComponentBase{
	private String content;
	  public Email_ConcreteComponent(String content){
	    this.content = content;
	  }
	  @Override
	  public String getContents() {
	    return content;
	  }
}
