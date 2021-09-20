package prob03;

public class Unit {

	public static void main(String[] args) {

		Marine marine = new Marine();
		Tank tank = new Tank();
		DropShip dropship = new DropShip();

		tank.move(10, 10);
		tank.stop(10, 10);
		tank.changeMode(true);

		Marine marrine = new Marine();

	}

}
