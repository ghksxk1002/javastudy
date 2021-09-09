package paint;

public class ColorPoint extends Point {
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void show() {
		System.out.println("점 [X="+ getX() + ",y =" + getY() +", color = red "+"]를 그렸습니다");
		
	}
	
}
