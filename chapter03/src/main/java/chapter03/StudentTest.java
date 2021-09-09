package chapter03;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setGrade(1);
		
		Person p1 = s1;//업 케스팅
		
		p1.setName("둘리");
		
		Student s2 = (Student)p1;// 다운 케스팅 명시적
		s2.setMajer("cs");
		

	}

}
