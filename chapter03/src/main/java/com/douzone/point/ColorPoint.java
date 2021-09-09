package com.douzone.point;

public class ColorPoint extends Point {

	private String color;


	public ColorPoint(int x, int y, String color) {
		super(x,y);
		//setX(x);
		//setY(y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void show() {
		System.out.println("점 [X=" + getX() + ",y =" + getY() + ", color = red " + "]를 그렸습니다");

	}

}
