package prob2;

public class SmartPhone extends MusicPhone {

	public void execute(String function) {

		if (function == "앱") {
			System.out.println("앱실행");
			return;
		} else if (function == "통화") {
			System.out.println("통화가능시작");
			return;
		}
		super.execute(function);
	}

}
