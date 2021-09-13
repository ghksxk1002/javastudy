package collection;

import java.util.Objects;

public class Gugudan {
	
	private int left;
	private int rigth;
	
	public Gugudan(int left, int rigth) {
		
		this.left = left;
		this.rigth = rigth;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(left*rigth);//헤쉬코드값을 비교하기위해
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gugudan other = (Gugudan) obj;
		//return left == other.left && rigth == other.rigth;
		return left*rigth == other.left && rigth*left == other.rigth;
	}



	@Override
	public String toString() {
		return "Gugudan [left=" + left + ", rigth=" + rigth + "]";
	}


}
