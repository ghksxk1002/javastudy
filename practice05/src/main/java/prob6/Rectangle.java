package prob6;

public class Rectangle extends Shape implements Resizable {//직사각형

	private int weight;
	private int height;
	
	public Rectangle(int weight, int height) {
		this.weight = weight;
		this.height  = height;
	}

	@Override
	public double getArea() {
		double area = this.weight*this.height;
		return area;
	}

	@Override
	public double getPerimeter() {
		double per = (this.weight+this.height)*2;
		return per;
	}

	@Override
	public void resize(double d) {
		this.weight *= d;
		this.height  *= d;
	}

}
