package structuralDecoratorPat.gofEx;

public class ExternalEmailDecorator_ConcreteDecorator extends EmailDecorator_DecoratorBase{
	private String content; 
	  public ExternalEmailDecorator_ConcreteDecorator(IEmail_ComponentBase basicEmail){
	    originalEmail = basicEmail;
	  }
	  @Override
	  public String getContents() {
	    content = addDisclaimer(originalEmail.getContents());
	    return content;
	  }
	  private String addDisclaimer(String message){
		  //append company disclaimer to message
	    return  message + "\n Company Disclaimer";
	  }
}
