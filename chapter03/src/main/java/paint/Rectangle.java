package paint;

public class Rectangle extends Shape {
	private int X1, Y1;
	private int X2, Y2;
	private int X3, Y3;
	private int X4, Y4;
	
	@Override
	public void draw() {
		System.out.println("사각형을 그렸습니다");
	}
	
	public int getX1() {
		return X1;
	}
	public void setX1(int x1) {
		X1 = x1;
	}
	public int getY1() {
		return Y1;
	}
	public void setY1(int y1) {
		Y1 = y1;
	}
	public int getX2() {
		return X2;
	}
	public void setX2(int x2) {
		X2 = x2;
	}
	public int getY2() {
		return Y2;
	}
	public void setY2(int y2) {
		Y2 = y2;
	}
	public int getX3() {
		return X3;
	}
	public void setX3(int x3) {
		X3 = x3;
	}
	public int getY3() {
		return Y3;
	}
	public void setY3(int y3) {
		Y3 = y3;
	}
	public int getX4() {
		return X4;
	}
	public void setX4(int x4) {
		X4 = x4;
	}
	public int getY4() {
		return Y4;
	}
	public void setY4(int y4) {
		Y4 = y4;
	}
	
	
}
