package kr.co.koreait.class9;

import java.util.ArrayList;

public class Class9 {

	public static void main(String[] args) {
		// 0. 매서드의 구성요소 3가지
		// 메서드 : 어떤 동작이나 코드를 하나의 메서드로 묶어두고 언제든 몇번이든 실행할 수 있는 것
		// 특징 : 메서드는 클래스 안에서만 만들 수 있다.
		
		// 메서드를 실행하는 방법
		// 1) 클래스를 사용할 수 있는 형태로 만들어야 한다.
		Class9 c = new Class9();	// 객체 선언
		// 2) 객체 이름.메서드이름()
//		c.hello();
		
		// 0-1. 접근제한자
		// > 클래스, 변수, 메서드 등에서 모두 사용할 수 있으며, 외부에서 접근할 수 있는 범위를 제한한다.
		// - 다른 클래스 파일(Ex.class2 파일)이 메서드에 접근을 해도 되는지 범위를 지정
		
		// 0-2. 매개 변수
		// > 메서드를 실행할 때 외부에서 전달받은 값을 저장하는 변수이다.
		// - 메서드에서 사용되는 변수로 메서드 안에서만 사용할 수 있다.
		/* c.hello("Tom", 35); */
		// 매개변수는 순서대로 데이터가 들어간다.
		
		// 0-3. 반환 ( return )
		// > 메서드를 실행한 위치로 값을 전달(반환)해주는 것
//		int result = c.hello("Alice", 20);
//		System.out.println(result);
		// ====================================================================================
		// 1. static ( 정적 ) 
		// > 객체를 생성하지 않아도 클래스 이름으로 바로 사용할 수 있게 해주는 키워드
		
		// Counter 클래스에 변수나 메서드 같은 것을 사용하려면 객체를 선언해야한다.
//		Counter c1 = new Counter(); // 생성자가 실행되어서 숫자 1이 증가되었다.
//		Counter c2 = new Counter();
//		Counter c3 = new Counter();
		
		// 생성자가 3번 실행되니깐 기대하는 값도 count 3이라는 숫자를 보고 싶다.
		// 일반적으로 사용하는 필드(클래스 안에서 사용되는 변수)는 값을 서로 공유하지 않는다.
		
		// static 키워드의 특징
		// 1) 변수에 사용 : 전역변수로 변하며, 값을 공유하게 된다.
		
//		System.out.println(c1.count);
		// Counter 클래스로 만든 모든 객체의 count 변수가 공유 상태로 변경
		
		// 2) 객체를 생성하지 않고도 사용할 수 있다.
		// > 클래스를 사용하려면 무조건 객체를 선언해서 사용해야 했다.
		// Ex. Class c1 = new Class();
//		System.out.println(Counter.count);
		// 클래스명을 사용해서 static 변수를 가져온다.
//		Counter.addCount(); // count 값 1 증가
//		System.out.println("count의 값 : " + Counter.getCount());		// count 값을 가져온다.
		
		// static 주의점
		// > 객체를 선언하지 않고도 사용할 수 있으면 편한게 아닌가? 왜 많이 사용하지 않는가?
		// 1) static 메서드에서는 일반 멤버 변수(필드)는 사용할 수 없다.
		
		// 2) 메모리 과다 사용 위험
		// > static은 프로그램 종료까지 메모리에 남는다.
		// 만약에 메모리에 만명 ~ 십만명 유저 데이터가 계속 쌓이게 되면 서버가 터지거나, 메모리 공간이 부족해진다.
		
		// static은 보통 상수, 설정 값, 어디서나 꼭 사용해야하는 메서드를 사용할 때 선언한다.
		
		// =======================================================================================
		// 2. 형변환 (Type Casting)
		// > 기존의 사용하던 변수의 자료형 타입을 다른 타입으로 바꾸는 것
		
		// 자동 형변환 : 같은 자료형 타입끼리 변환하는 것이다.
		// > 작은 타입을 큰 타입으로 바뀔 때 자동으로 처리 ( byte -> short or int )
		
		// 강제 형변환 : 다른 자료형 타입끼리 변환을 하는 것이다.
		// > 개발자가 직접 형을 지정해서 처리하는 것
		
		// 1) 실수형을 정수형으로
//		double score = 92.7; // 정수형으로 바꾸고싶다.
//		int result = (int)score;
//		System.out.println(result);
		// 소수점 뒷 부분은 사라진다.
		
		// 2) 같은 정수형끼리
		// 2-1) 작은 정수 -> 큰 정수
//		byte num = 120;	 // -128 ~ 127
//		int number = num; // -21억~ 21억
//		System.out.println(number);
		// 자동 형변환이 되었다.
		
		// 2-2) 큰 정수 -> 작은 정수
//		int num2 = 130;
//		byte number2 = (byte)num2;
		// byte는 양수 127까지의 숫자만 담을 수 있는데, 값을 넘으면 어떻게 되는가?
//		System.out.println(number2); // -126이 출력되었다.
		// 오버플로우 : 표현할 수 있는 범위를 넘어가면 값이 순환되어서 깨지게 되는 현상
		// - 데이터 범위를 초과하면 최저 음수부터 다시 시작한다.
		
		// 3. 형변환을 해주는 메서드를 만들 것이다.
		// static 메서드로 만들었는데, 이유는 객체를 선언하지 않고 가볍게 사용할려고 
//		double d = 92.7;
//		int i = TypeCaster.toInt(d);
//		System.out.println("double > int : " + i);
//		
//		int num = 130;
//		byte b = TypeCaster.toByte(num);
//		System.out.println("int > byte : " + b);
//		
//		int x = 10;
//		double y = TypeCaster.toDouble(x);
//		System.out.println("int > double : " + y);
		
		// 4. 문자열(String) 변환
		// 기존 기본형 타입끼리 형변환은 (int, double, byte) 등 소괄호로 사용할 수 있었다.
		// 참조 자료형인 문자열로 바꾸고 싶으면 어떻게 해야하는가?
		
		// 4-1. 문자열을 기본 데이터 타입으로 바꾸는 방법
//		String a = "123";
//		
//		int num1 = Integer.parseInt(a);
//		System.out.println(num1);
//		
//		String b = "3.14";
//		double num2 = Double.parseDouble(b);
//		System.out.println(num2);
		// 문자열을 바꾸고싶은 타입의 래퍼 클래스의 parse기능을 사용하면 된다.
		
		// 4-2. 기본 데이터 타입의 데이터를 문자열로 바꾸고 싶다.
		// String.valueOf()
		
		int c2 = 10;
		String s3 = String.valueOf(c2);
		
		double d = 2.5;
		String s4 = String.valueOf(d);
		
		// ===========================================================================
		// 5. Object 타입
		// Object 클래스 : Java의 모든 클래스의 최상위 부모이다.
		
		// Object 타입 : 모든 타입을 저장할 수 있다.
		// 특징 : 꺼내서 사용할 때는 반드시 형변환을 해야한다.
		
		// 1) Object 타입의 변수
//		Object a = "가나다라";
//		Object b = 135;
//		Object c5 = 3.1415;
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c5);
		// 모든 데이터 타입을 담을 수 있으니 매우 편리하다.
		
//		// 2) Object타입 배열
//		Object[] arr = new Object[3];
//		arr[0] = "홍길동";
//		arr[1] = 20;
//		arr[2] = 175.5;
//		// 기존 배열에는 하나의 타입 데이터만 넣을 수 있었지만,
//		// Object 배열을 사용하니 모든 타입을 넣을 수 있다.
//		
//		for(Object a : arr) {
//			System.out.println(a);
//		}
		
		// 3) Object 컬렉션 프레임워크
		// ** Object 타입과 컬렉션 프레임워크 조합은 실무에서도 정말 많이 사용한다.
		ArrayList<Object> list = new ArrayList<>();
		
		list.add("홍길동");
		list.add(25);
		list.add(172.3);
		
		System.out.println(list);
		
		// Object로 저장된 데이터를 기본형 데이터 타입에 저장할려면 형변환을 꼭 해야한다.
		String name = (String)list.get(0);
		int age = (int)list.get(1);
		double height = (double)list.get(2);
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
	}
}
class TypeCaster{
	// double -> int
	public static int toInt(double value) {
		return (int)value;
	}
	// int -> byte
	public static byte toByte(int value) {
		return (byte)value;
	}
	// int -> double
	public static double toDouble(int value) {
		return (double)value; 
	}
}





class Counter{
	// static을 사용한 변수와 사용하지 않은 변수의 차이점
	static int count = 0;
	int age = 35;
	
	// static 메서드 만들어보기
	public static int getCount() {
		// static 메서드이며, 숫자를 반환해주는 메서드 이다.
		return count; 
	}
	
	public static void addCount() {
		// static 메서드이며, 반환을 하지 않는 메서드이다.
		count++;
	}
	
//	Counter() {	// 클래스에서 사용되는 특별한 메서드 : 생성자
//		count++;
//	}
	
}
