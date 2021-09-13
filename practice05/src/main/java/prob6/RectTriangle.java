package prob6;

public class RectTriangle extends Shape {

	
	private int weight;
	private int height;
	
	public RectTriangle(int weight, int height) {
		this.weight = weight;
		this.height  = height;
	}

	@Override
	public double getArea() {
		double area = (this.weight*this.height)/2;
		return area;
	}

	@Override
	public double getPerimeter() {
		double per = this.weight+this.height+
					Math.sqrt(this.weight*this.weight+this.height*this.height);	
		return per;
	}

}
