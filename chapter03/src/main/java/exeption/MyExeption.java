package exeption;

public class MyExeption extends Exception {
	private static final long serialVersionUID = 1L;
	
	public MyExeption(String message) {
		super(message);
	}
	
	public MyExeption() {
		super("MyException Occurs!!");
	}
}
