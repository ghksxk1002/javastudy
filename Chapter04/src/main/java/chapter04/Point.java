package chapter04;

import java.util.Objects;

public class Point {
	
	private int x;
	private int y;

	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {//해쉬코드를 먼저 불르게되어 있기 떄문에 해쉬코드를 오버라이드 한다. 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

}
