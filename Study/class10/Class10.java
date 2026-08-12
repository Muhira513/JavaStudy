package kr.co.koreait.class10;

//import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {
		// 1. 가변길이 매개변수
		// 매개변수 : 메서드를 호출할 때 데이터를 보내주고, 담을 수 있는 메서드 안에서 사용하는 변수
		// 가변길이 매개변수 : 매개변수에서 데이터의 숫자를 유동적으로 설정하는 방법
		// > 1개를 보낼 수도 있고, 3개를 보낼 수도 있고, 10개를 보낼 수 있다.
		// static으로 메서드가 선언되어 있어서 아래처럼 사용이 가능한 것이다.
		// 클래스명.메서드명
//		VarArgs.printNumber(150);
		
		// 매개변수를 2개 보내고 싶다.
//		VarArgs.printNumber(100, 200);
//		VarArgs.printNumber(100, 200, 300);
//		VarArgs.printNumber(100, 200, 300, 400);
		
		// 가변길이 매개변수의 핵심
		// 기존에 사용하던 매개변수는 개수가 고정적이다.
		// 가변길이 매개변수를 사용하면 데이터 개수를 몇개든 보낼 수 있다.
		
		// 가변길이 매개변수 주의 사항
		// 1) 가장 마지막 순서로 작성되어야 한다.
		// 잘못된 예시 ) (int... numbers, int a) 매개 변수를 앞에다가 쓰면 안된다
		// 맞는 예시 ) (int a, int... numbers)
		// 2) 하나의 메서드안에서 한 개만 사용 가능하다.
		
		// ====================================================================================
		// 1. 메서드 오버로딩
		// > 같은 메서드 이름을 사용하면서, 매개변수의 타입을 다르게 한다.
		// -> 똑같은 이름의 메서드를 여러 개 만들 수 있다.
		
		// 객체 선언
//		Overloading o = new Overloading();
//		// 1) 매개변수의 개수를 다르게 함으로써 오버로딩을 했다.
//		o.add(1);				// 매개변수 한 개
//		o.add(10, 20);			// 매개변수 두 개
//		o.add(100, 200, 300);	// 매개변수 세 개
//		
//		// add라는 이름의 메서드를 사용하는데 3개 모두 다른 결과가 나왔다.
//		
//		// 2) 매개변수의 타입을 다르게 함으로써 오버로딩을 할 수 있다.
//		o.sub(15, 32);		// 정수형 데이터 2개
//		o.sub(30, 1.5);		// 정수형 데이터 1개, 실수형 데이터 1개
//		
//		// 3) 매개변수 타입의 순서를 다르게 함으로써 오버로딩을 할 수 있다.
//		o.sub(3.1415, 50);	// 실수형 데이터 1개, 정수형 데이터 1개 (순서를 바꿨다)
	
		// 다형성이란 것을 구현하기 위해서는 2가지 방법
		// 1) 오버로딩 : 메서드의 매개변수의 순서나 타입이나 개수를 다르게 한다.
		// 2) 오버라이딩 : 상속에서 부모가 가진 메서드를 내가 새롭게 만든다.
		
		// ====================================================================
		// 2. Interface
		// > 클래스가 반드시 구현해야 하는 메서드를 미리 정의해두고 미완성으로 만들어 두는 것
		// - 인터페이스 파일은 실행 코드를 넣어두는 것이 아니라 규칙을 만드는 틀이다.
		// - 설계할 때 많이 사용한다.
		
		// 목적 : 서로 실수하는 것을 방지하기 위해서 어떤 기능을 어떻게 만들지 규칙을 정하는 것
		
		// 카드 결제와 현금 결제를 하는 프로그램
//		Scanner sc = new Scanner(System.in);
//		
//		// null 값을 넣어서 반만 완성을 시켜놓았다.
//		Payment payment = null;
//		
//		// 반복문 ( 조건을 완수할때까지 )
//		while(true) {
//			System.out.println("상품을 선택해주세요");
//			System.out.println("1. 커피 (3,000원)");
//			System.out.println("2. 햄버거 (7,000원)");
//			System.out.println("3. 컴퓨터 (1,300,000원)");
//			System.out.println("0. 종료");
//			System.out.println("선택 >> ");
//			
//			// 상품 선택을 받는 변수
//			int product = sc.nextInt();
//			int price = 0;
//			
//			// 상품 선택에 따른 조건문
//			if(product == 1) {
//				price = 3000;
//			} else if(product == 2) {
//				price = 7000;
//			} else if(product == 3) {
//				price = 1300000;
//			} else if(product == 0) {
//				break; //반복문을 종료한다.
//			}
//			
//			System.out.println("\n결제 방식을 선택해주세요");
//			System.out.println("1. 카드");
//			System.out.println("2. 현금");
//			System.out.println(">> 선택 : ");
//			
//			int payType = sc.nextInt();
//			
//			if(payType == 1) {
//				payment = new CardPayment();
//				// Payment payment = new CardPayment();
//			} else if(payType == 2) {
//				payment = new CashPayment();
//				// payment payment = new CashPayment();
//			}
//			
//			payment.pay(price);		
//		}
		
		// 인터페이스 : 규칙을 지정해두는 파일
		// > 어떤 메서드가 필요하고, 그 메서드를 어떤 형태로 만들어야 하는지 규칙
		// - 구현 클래스 : 인터페이스가 만들어둔 규칙을 따라서 메서드를 완성하는 클래스
		
		// 클래스를 사용할 때는 보통 객체를 구현해야 한다.
		// Ex. CardPayment c = new CardPayment();
		
		// 인터페이스를 사용하겠다. 선언을 했다.
		// Payment p = new CardPayment();
		// -> 업 캐스팅
		// 언제든 객체의 구현체를 손쉽게 바꾸기 위해서 위와 같이 사용한다. 
		
		//  조건문 선택에 따라서 Card가 올 수 있고, Cash
		
		// ================================================================
		// 3. 재귀 호출
		// 재귀호출을 사용하지 않을력로 사용 방법을 본다.
		// > 메서드가 자기 자신을 다시 실행하는 방식을 재귀호출이라고 부른다.
//		Ex.countDown(3);
		
		// 재귀호출은 아래에 이유로 많이 사용되지 않는다.
		// 1) 성능 문제 : 재귀 호출의 깊이가 깊어질수록 메모리를 많이 차지하기 때문에 반복문 보다 느리다.
		// 2) 디버깅 문제 : 호출의 깊이가 깊어질수록 추적하기 어려워진다.
		// 3) 대체 가능 : 반복문으로 쉽게 대체가 가능하다.
		
		// 정보처리기사 ~ 산업기사 ~ 기능사 부분에서 시험 문제로 몇 문제 나온다.
	}
}

//class Ex {
//	
//	public static void countDown(int n) {
//		if (n == 0) {
//			System.out.println("끝!");
//			return;
//			// 뒤에 내용을 실행하지 말고 호출한 곳으로 돌아가라
//		}
//		System.out.println(n);
//		// 재귀 호출 : 자기 자신을 실행
//		countDown(n - 1);
//		// n - 1 : 재귀 호출이 끝나는 조건이다.
//		// > 무한하게 반복되지 않게 해주는 것이다.
//	}
//}
//class Overloading{
//	// 하나의 클래스 안에서 똑같은 이름의 메서드는 한 개만 존재할 수 있다.
//	// 오버로딩 : 클래스 안에서 하나의 메서드 이름을 여러번 사용
//	public void add(int a) {
//		System.out.println("한 개의 매개변수를 받았습니다.");
//	}
//	
//	public void add(int a, int b) {
//		System.out.println("두 개의 매개변수를 받았습니다.");
//	}
//	
//	public void add(int a, int b, int c) {
//		System.out.println("세 개의 매개변수를 받았습니다.");
//	}
//	// 매개변수의 타입을 다르게 함으로써 오버로딩
//	public void sub(int a, int b) {
//		// 정수형 데이터 2개 받는다.
//		System.out.println("첫 번째 타입은 int, 두 번째 타입은 int");
//	}
//	
//	public void sub(int a, double b) {
//		// 정수형 데이터 1개, 실수형 데이터 1개
//		System.out.println("첫 번째 타입은 int, 두 번째 타입은 double");
//	}
//	
//	public void sub(double a, int b) {
//		// 위에 메서드와 타입의 수는 똑같지만, 순서를 다르게 만들었다.
//		System.out.println("첫 번째 타입은 double, 두 번째 타입은 int");
//	}
//	
//}
	
//class VarArgs{
//	// 가변길이 매개변수를 사용할려면 메서드가 필요하다.
//	public static void printNumber(int a, int... numbers) {
//		// public(접근제한자) : 누구나 어디서든 사용가능하다.
//		// static : 객체를 선언하지 않고 사용할 수 있다.
//		// void(반환) : 반환을 해주지 않는다.
//		
//		System.out.println("매개변수 a의 값 : " + a);
//		
//		// 가변길이 매개변수 사용방법 : 데이터 타입... 변수이름
//		
//		for(int num : numbers) {
//			System.out.println("가변길이 매개변수의 값 : " + num);
//		}
//		System.out.println();// 한 줄 건너뛰기
//	}
//}

