package paint;

public class Main {

	public static void main(String[] args) {
	
		Point point1 = new Point();
		point1.setX(10);
		point1.setY(10);
		
		//drawPoint(point1);
		point1.show(false);
		
		Point Point2 = new ColorPoint();
		Point2.setX(100);
		Point2.setY(200);
		((ColorPoint)Point2).setColor("red");
		//drawPoint(Point2);
		draw(Point2);
		
		
		Point2.show(false);
		Point2.show(true);
		
		Triamgle triamgle = new Triamgle();
		draw(triamgle);
		//drawShape(triamgle);
		
		Rectangle rect = new Rectangle();
		//drawShape(rect);
		draw(rect);
		Circle circle = new Circle();
		//drawShape(circle);
		draw(circle);
		
		GraphicText graphicText = new GraphicText("Hello World");
		draw(graphicText);
		
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
	/*public static void drawTriamglee(Triamgle triamgle) {
		triamgle.draw();
	}
	
	public static void drawRectangle(Rectangle rectangle) {
		rectangle.draw();
	}
	
	public static void drawCircle(Circle circle) {
		circle.draw();
	}*/
	
	//public static void drawColorPoint(ColorPoint colorPoint) {
	//	colorPoint.show();
		
	//}
	
}
