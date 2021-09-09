package com.douzone.main;

import com.douzone.inter.Drawable;
import com.douzone.point.ColorPoint;
import com.douzone.point.Point;
import com.douzone.shape.Circle;
import com.douzone.shape.Rectangle;
import com.douzone.shape.Shape;
import com.douzone.shape.Triamgle;
import com.douzone.text.GraphicText;

public class Main {

	public static void main(String[] args) {
	
		Point point1 = new Point(10 , 10);
		
		//drawPoint(point1);
		point1.show(false);
		
		Point Point2 = new ColorPoint(100, 200, "red");
		//Point2.setX(100);
		//Point2.setY(200);
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
		
		// instanceof test
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		// 오휴 : class 는 hierachy(계층) 상위와 하위만  instanceof 연산자를 사용할수 있다
		//System.out.println(circle instanceof Rectangle)); 
		
		//interface는 hierachy와 상관 없이 instanceof 연산자를 사용할수 있따.
		System.out.println(circle instanceof Drawable);
		System.out.println(circle instanceof Runnable);
		
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
