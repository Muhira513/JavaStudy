package kr.co.koreait.class1;

public class Snack {
	int price;		// 과자의 가격
	
	// 생성자 : 클래스의 이름() { 
			// }
	// 기본 생성자 : 매개변수가 없는 생성자를 뜻한다.
	Snack() {
		price = 3000;
	}
	
	// 매개 변수가 있는 생성자
	Snack(int price) {
		// 상황 : 매개변수의 이름을 필드의 이름과 똑같이 사용하고 싶다.
		// 매개변수에 매개변수 값을 초기화 하고 있다.
		// this 키워드 : 자기 자신(클래스)을 지칭하는 키워드
		this.price = price;
		// 내가 필드로 가지고 있는 price 안에 매개변수 price를 초기화 하겠다.
		// 매개변수와 필드의 이름을 똑같이해서 연결시키는 것이 직관적이다.
	}
	// 생성자는 객체가 생성되는 동시에 실행되는 것이기에 다른 메서드들 보다 매우 빨리 실행된다.
	
	public void info() {
		System.out.println("과자의 가격은 " + price + "원 입니다.");
	}
}
