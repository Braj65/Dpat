package structuralDecoratorPat.gofEx;

public class SecureEmailDecorator_ConcreteDecorator extends EmailDecorator_DecoratorBase {
	private String content; 
	  public SecureEmailDecorator_ConcreteDecorator(IEmail_ComponentBase basicEmail){
	    originalEmail = basicEmail;
	  }
	  @Override
	  public String getContents(){
	  //secure original 
	    content = encrypt(originalEmail.getContents());
	    return content;
	  }
	  private String encrypt(String message) {
	    String encryptedMessage=message;
	    return  encryptedMessage;
	  }
}
