package prob03;

public class Tank extends Unit {
	// 현재 위치
	private int x;
	private int y;

	public void move(int x, int y) {
		/* 지정된 위치로 이동 */
		System.out.println("(" + x + "," + y + "로 이동하였습니다");
	}

	public void stop(int x, int y) {
		/* 현재 위치에 정지 */
		System.out.println("(" + x + "," + y + "에서 정지하였습니다");
	}

	public void changeMode(boolean changeMode) {
		/* 공격모드를 변환한다. */
		if (changeMode) {
			System.out.println("시즈모드");
		}
		else {
			System.out.println("시즈모드 해체");
		}
	}
}
