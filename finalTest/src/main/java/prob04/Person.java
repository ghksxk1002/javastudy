package prob04;

public class Person {
	private static int numberOfPerson; // 전체 인구수
	private int age;
	private String name;
	
	public Person(String name) {
		this.name = name;
		numberOfPerson++;
	}
	public Person(int i, String name) {
		this.name = name;
		this.age = i;
		numberOfPerson++;
	}


	public void selfIntroduce() {
		System.out.println("내 이름은 "+ this.name + " 입니다");
	}


	public static int getPopulation() {
		
		int arr = numberOfPerson;
		return arr;
	}
	
	/* 코드 작성 */
	
}
