package prob05;
//어려워
@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException{
		
		public UserNotFoundException() {
	        super();   		
		}
	    
		public UserNotFoundException(String message) {
	        super(message);   		
		}
}
