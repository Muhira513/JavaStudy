package kr.co.koreait.class8;

public class Person {
	// 해당 클래스에는 메인 메서드가 없다. ( 실행 X ) 
	// Person 파일에는 여러가지 필드(변수)와 메서드를 모아둘 것이다.
	
	// 1) 필드(변수) : 클래스 안에서 사용되는 변수
	int age = 10;
	String name = "Bob";
	/* private String password = "1234"; */
	
	
	// 2) 메서드(기능)
	
	public void run() {
		System.out.println("저희 이름은 " + name + "입니다.\n저는 현재 달리고 있습니다.");
	}
	
	// 값을 반환해주는 메서드
	public String name() {
		return name;
	}
	
	public int age() {
		return age;
	}
	
	// 실습 : 2개의 메서드를 만들어주세요
	// public void eat(), public void sleep()
	// eat() : name + "은 밥을 먹고 있습니다" -> 출력
	// sleep() : name + "은 잠을 자고 있습니다" -> 출력
	
	public void eat() {
		System.out.println(name + "은 밥을 먹고 있습니다.");
	}
	
	public void sleep() {
		System.out.println(name + "은 잠을 자고 있습니다.");
	}
	
}
