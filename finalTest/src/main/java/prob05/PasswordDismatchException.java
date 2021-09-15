package prob05;
//어렵당
@SuppressWarnings("serial")
public class PasswordDismatchException extends RuntimeException {
	public PasswordDismatchException() {
		super();
	}

	public PasswordDismatchException(String message) {
		super(message);
	}

}
