package kr.co.koreait.class8;

//import java.util.ArrayList;

import java.util.Scanner;
public class Class8 {

	public static void main(String[] args) {	// 특수한 메서드
		// 메서드의 개념을 확인하고, 메서드를 만들고 실행할 것이다.
		// 클래스, 메서드 : 정말 중요한 개념
		
		// 클래스 : 개발자가 프로그램을 만들기 위해 작성하는 설계도
		// 객체지향 언어 : Java와 Python 등의 언어를 객체지향 언어
		// 클래스의 구성요소 : 필드(변수), 메서드(기능 또는 동작)
		
		// 1. 메서드
		// > 클래스 내부에서 정의된 동작이나 기능을 수행하는 역할을 한다.
		// 사용 이유 : 기능(동작)을 한 번 정의를 해두면 어디서든 몇번이든 재사용 가능하다.
		// 메서드를 만드는 위치 : 클래스 안에서만 만들 수 있습니다.
		// > 여기 메인 메서드 안에서는 새로운 메서드를 만들 수 없다.
		
		// 메서드를 사용하기 앞서서 클래스를 사용할 수 있는 형태로 선언을 해야 합니다.
//		Class8 c = new Class8(); // 객체 선언
		// 이제 Class8에 기능을 c라는 이름으로 모두 사용할 수 있다.
//		c.sayHello();
		
		// 1-1. 다른 파일에 기능을 만들어 두고 가져와서 사용하겠다.
		
		// Person 클래스에 모든 기능을 사용하고 싶다.
		/* Person p = new Person(); */
		
		// 기능을 다른 파일에 만들어두고 가져와서 사용했다.
		/* p.run(); */
		
		// 값을 반환해주는 메서드를 실행하겠다.
		// > 반환값이 있는 메서드를 실행 할 때는 저장을 하거나, 실행(출력)
		/*
		 * int age = p.age(); 
		 * String name = p.name(); 
		 * System.out.println("이름은 " + name + ", 나이는 " + age);
		 */
		
		// 반환 값이 있는 메서드를 바로 실행하는 방법
		/* System.out.println("이름은 " + p.name() + ", 나이는 " + p.age()); */
		
		// > 메서드를 실행한 것이 아니라, 필드(변수)를 직접 가져오는 방법
		/* System.out.println("이름은 " + p.name + ", 나이는 " + p.age); */
		
		/* p.eat();
		 * 
		 * p.sleep();
		 */
		
		// 메서드의 구성요소
		// 1) 접근제한자 : public, default, prvate
		// 2) 매개변수 : 소괄호 안에 전달하는 변수
		// 3) 반환(return) : 실행한 위치로 값을 반환해준다. void
		//=========================================================================================
		
		// 2. 접근제한자
		// > 클래스, 변수, 메서드 등에서 모두 사용할 수 있고, 외부에서 접근을 제한하는 키워드
		// 즉, 어디까지 이 기능을 사용할 수 있는지 범위를 지정
		// public : 어디서나 누구든 모두 사용할 수 있다.
		// (default) : 같은 패키지 안에 있으면 사용 가능하다.
		// > 우리가 지금까지 정말 많이 사용해 왔다. default는 키워드를 입력하지 않는게 사용하는 방법이다
		// private : 클래스 안에서만 사용할 수 있고, 외부에서는 절대 사용 불가능 하다.
		
//		Person p = new Person();
//		System.out.println(p,password);
		// 접근제한자는 왜 사용하는가?
		// > 데이터를 보호하고, 잘못된 사용을 방지하기 위해서 보호를 하는 것이다.
		
		//=========================================================================================
		// 3. 매개변수
		// > 메서드를 실행할 때 데이터를 보내주고, 메서드에서는 매개변수로 데이터를 저장
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("이름을 입력해주세요 : ");
//		String name = sc.nextLine();
//		// 메서드를 실행할 때 데이터도 같이 보내겠다.
//		
//		Class8 c = new Class8();
//		c.sayName(name);	// name 변수를 sayName에 name 매개변수에 보낸다.
		// 사용되는 변수의 이름과 매개변수의 이름은 서로 달라도 문제 없다.
		// 매개변수의 사용 범위 : 메서드 안에서만 사용 가능하다.
		
		// Calc 클래스를 사용하겠다. ( 객체 선언 )
//		Calc c = new Calc();
//		c.sub(100, 50); // a에는 숫자 100이 들어가고, b에는 숫자 50이 들어간다.
//		
//		c.mul(2, 5);
//		
//		c.div(30, 3);
		
		// 매개변수 정리 : 실행할 때 데이터를 전달할 수 있는 것이다.
		// > 매개변수의 숫자는 제약이 없다. ( 몇개든 사용할 수 있다. )
		
		// =================================================================================
		// 4. 반환 ( return )
		// > 메서드에서 코드가 실행되고 어떤 데이터를 실행된 위치로 반환(전달)을 해주는 키워드
		// 1) 기본 타입 : int, double, char
		// 2) 클래스 타입 : 참조형, 객체형 String, List(Array, Hash, HashMap)
		// 3) 배열 : 배열 타입의 데이터도 전달(반환)
		// 4) void : 반환을 하지 않겠다. ( 반환 할 값이 없다 )
		
//		Tom tom = new Tom();
//		System.out.println("이름은 " + tom.getName());
//		System.out.println("나이는 " + tom.getAge());
//		System.out.println("생일은 " + tom.getBirth());
//		
//		// 매개변수나, 반환은 기본 타입 데이터뿐 아니라 객체형, 참조형 데이터도 보낼 수 있다.
//		int[] numbers = {100, 200, 300, 400};
//		
//		ArrayList<Integer> list = tom.Arr(numbers);
//		System.out.println(list);
		
		// =======================================================================================
		// 5. 상품 결제 프로그램을 만들 것이다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품명 입력 : ");
		String name = sc.nextLine();
		
		System.out.println("가격 입력 : ");
		int price = sc.nextInt();
		
		System.out.println("수량 입력 : ");
		int qty = sc.nextInt();
		
		// 상품 정보를 전달
		Product pro = new Product();
		pro.setProduct(name, price, qty);
		
		pro.print();
		
	}
	
//	public void sayName(String name) {
//		System.out.println("저의 이름은 " + name + "입니다.");
//	}
	
	// 여기부터가 클래스의 영역이다. 즉, 여기서부터 메서드를 만들 수 있다.
	// > 안녕하세요를 출력하는 메서드 sayHello
	
//	public void sayHello() {
//		// sayHello() 메서드를 실행했을 때 동작하는 코드를 넣어두면 된다.
//		System.out.println("안녕하세요");
//	}
}

// 새로운 클래스를 여기에 만들겠다.
//class Calc {
//	// 하나의 파일에 여러 개의 클래스를 만들 수 있다.
//	// 그러나, public class는 한 개의 파일 안에서 하나 만 가질 수 있다.
//	
//	// 뺄셈 메서드
//	public void sub(int a, int b) { // 정수형 데이터 2개를 매개변수로 받겠다.
//		int result = a - b;
//		System.out.println("뺄셈 결과 : " + result);
//	}
//	// 곱셈 메서드
//	public void mul(int a, int b) {
//		int result = a * b;
//		System.out.println("곱셈 결과 : " + result);
//	}
//	// 나눗셈 메서드 ( 몫 )
//	public void div(int a, int b) {
//		int result = a / b;
//		System.out.println("나눗셈 결과(몫) : " + result);
//	}
//	
//	
//}

//class Tom{
//	// 1) 클래스 안에서 사용 할 변수(필드)
//	String name = "Tom";
//	int age = 20;
//	String birth = "0101";
//	
//	// 2) 반환을 해주는 메서드
//	public String getName() {
//		// > String 타입의 데이터를 반환 해줘야 한다.
//		return name;
//	}
//
//	public int getAge() {
//		// > int 타입의 데이터를 반환 해줘야 한다.
//		return age;
//	}
//	
//	public String getBirth() {
//		// > String 타입의 데이터를 반환 해줘야 한다.
//		return birth;
//	}
//	
//	// 배열을 매개변수로 받아보겠다.
//	public ArrayList<Integer> Arr(int[] arrays) {
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		// 향상된 for문으로 출력
//		for(int a : arrays) {
//			list.add(a);
//		}
//		
//		return list;
//		
//	}
//}




