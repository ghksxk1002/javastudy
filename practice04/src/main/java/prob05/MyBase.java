package prob05;

public class MyBase extends Base {

	@Override
	public void service(String state) {

		if (state.equals("낮")) {
			System.out.println("낮에는 열씸히 일하자");
		} else if (state.equals("밤")) {
			night();
		} else {
			System.out.println("오후도 낮처럼 일하자");
		}

	}

}
