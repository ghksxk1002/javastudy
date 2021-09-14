package prob05;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException() {
		System.out.println("사용자를 찾을수 없습니다");
	}
}
