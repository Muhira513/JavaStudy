package kr.co.koreait.class3;

public class Class3 {

	public static void main(String[] args) {
		// 객체 지향 프로그래밍 4대 특징
		// 1) 캡슐화 : 변수나 메서드 등 클래스로 묶어서 사용하고 불필요한 동작이나 정보를 노출시키지 않는다.
		// > private, getter, setter
		// 2) 상속 : 부모 클래스가 가지고 있는 기능(필드, 메서드, 생성자)을 자식 클래스에게 물려준다.
		// > extends
		
//		Encap e = new Encap();	// 객체 선언 ( 객체 생성 )
//		e.setPassword("12345678");
//		System.out.println(e.getPassword());
		
		// 2개의 클래스를 만들어두었다.
//		Child c = new Child();
		// > 현재 Child 클래스에는 아무 기능이 없다.
//		c.hello();
//		System.out.println(c.number);
		
		// ============================================================================
		// 1. 다형성
		// 하나의 요소가 다양한 형태를 가지는 것을 다형성이라고 부른다.
		// - 메서드의 하나의 이름을 사용하지만 상황이나 객체에 따라서 다르게 동작하도록 만드는 것
		// 다형성을 구현하는 두 가지 방법
		// 1-1. 오버로딩 ( Overloading )
		// > 똑같은 이름의 메서드를 '매개변수의 개수나 타입을 다르게 함으로써' 여러 메서드를 만드는 것
//		Loading l = new Loading();
//		l.add(); 		// 첫 번째 add
//		l.add(10); 		// 두 번째 add
//		l.add(1, 2); 	// 세 번째 add
//		l.add(1, 1.5); 	// 네 번째 add
//		l.add(3.2, 2);	// 다섯 번째 add
		
		// 생성자 오버로딩
		// 생성자 : 객체가 선언되는 동시에 실행되는 특별한 메서드이다.
//		Phone p1 = new Phone("갤럭시노트", 20, "흰색");
//		p1.phoneInfo();
		
//		Phone p2 = new Phone("아이폰", 26);
//		p2.phoneInfo();
		
		// 생성자도 결국 하나의 메서드 라서 오버로딩을 사용할 수 있다.
		
		// 1-2. 오버라이딩
		// > 상속 관계에서 자식이 부모가 가진 메서드를 재정의(변경)하여 사용
		// -> 부모가 가진 것을 사용하지 않고 똑같은 이름으로 내가 만들겠다.
		
//		Samsung s = new Samsung();
//		s.powerOn();	// 자식에 오버라이딩된 메서드가 실행된다.
//		s.powerOff();
		
		// 다형성은 하나의 요소가 여러 형태를 가질 수 있는 것
//		Computer c = new Computer();
//		c.powerOn();
//		c.powerOff();
		
		// 오버로딩과 오버라이딩 공통점
		// > 다형성 : 하나의 메서드 이름으로 여러 형태를 가질 수 있는 것
		// 오버로딩 : 같은 메서드 이름을 '매개변수'로 다양하게 사용
		// 오버라이딩 : 같은 메서드 이름을 '객체'에 따라 다르게 동작
		
		// 오버라이딩을 사용하면 상속의 장점이 없어지는 것이 아닌가?
		// 부모가 가진 기능을 그대로 사용을 하고 덧붙혀서 사용할 수는 없는가?
		// 부모의 기능을 실행하는 super
		
		// =============================================================================
		// 2. 클래스 타입 변환
		// 타입 변환 : 타입을 변환하는 것인데 일반적으로 자료형 변환을 생각한다.
		// ex. int형 -> double형, String형 -> int형
		
		// 클래스 타입 변환 : 클래스의 객체 타입을 변환, 자식클래스 -> 부모클래스
		// 2-1. 클래스 자동 타입 변환 ( 업 캐스팅 )
		
		// 일반 객체 선언
//		Person p = new Person();
		
		// 자동 형변환, 업캐스팅을 사용하겠다.
//		Person s = new Student();
//		Person t = new Teacher();
		
		// [부모 클래스] [객체이름] = new [자식 클래스(구현체)];
		
		// 1) 컬렉션 프레임워크
		// Ex. List<Integer> list = new ArrayList<>();
		// 2) 인터페이스
		// Payment p = new CardPayment();
		
//		p.introduce();
//		s.introduce();
//		t.introduce();
		
		// 상속의 특징 : 자식은 부모의 기능도 사용하고 본인의 기능도 사용한다.
		// 업 캐스팅의 특징 : 본인 고유의 메서드를 사용할 수 없다.
		
//		Student s1 = new Student();
//		Teacher t1 = new Teacher();
//		s1.introduce();
//		s1.study();
		
		// 업 캐스팅을 사용하는 이유
		// 1) 여러 자식을 부모 타입으로 묶어서 관리하기 위해서
		// Person p = new 자식
		// 2) 공통 기능만 사용하도록 규칙을 제한하기 위해서
		// -> 자식의 고유 기능을 사용하지 못하도록 막는다.
		// 부모가 가진 기능만 공통적으로 사용하도록 일부러 규칙을 제한하는 것이고,
		// 프로그램의 구조와 규칙을 명확하게 하기 위해서 사용하는 목적이다.
		// > 무조건 자식 기능을 다 사용한다고 좋은 것이 아니다.
		
		// 2-2. 클래스 강제 타입 변환 ( 다운 캐스팅 )
		// 자식의 고유한 기능을 꼭 사용해야 할 경우 반대로 다운 캐스팅을 해줄 수 있다.
		// > 업 캐스팅 된 것을 반대로 바꿔준다.
		
//		Person s1 = new Student();
//		Person t1 = new Teacher();
		
		// 1) 즉시 다운 캐스팅 ( 고유 기능을 한 번만 사용 할 경우 )
//		((Student)s1).study();
//		((Teacher)t1).teach();
		
		// 2) 변수에 저장 후 다운 캐스팅 ( 고유 기능을 여러 번 사용 할 경우 )
//		Student s2 = (Student)s1;
//		Teacher t2 = (Teacher)t1;
//		s2.study();
//		t2.teach();
		
		// 객체 지향 프로그래밍 4대 특징 : 다형성
		// > 하나의 요소가 여러 가지 형태를 가질 수 있는 것
		// 오버로딩 : 똑같은 메서드 이름을 사용하는 데, [매개변수]의 갯수나 타입을 다르게 사용
		// 오버 라이딩 : 똑같은 메서드 이름을 사용하는데, 상속에 부모 메서드를 재정의 한다.
		
	}
}
class Person {
	// 부모 클래스
	public void introduce() {
		System.out.println("나는 사람입니다.");
	}
}

class Student extends Person {
	@Override
	public void introduce() {
		System.out.println("나는 학생입니다.");
	}
	
	// Student 고유 기능
	public void study() {
		System.out.println("공부중 입니다.");
	}
}

class Teacher extends Person {
	@Override
	public void introduce() {
		System.out.println("나는 선생입니다.");
	}
	
	// Teacher 고유 기능
	public void teach() {
		System.out.println("가르치는 중 입니다.");
	}
}

class Computer {
	// 부모 클래스
	public void powerOn() {
		System.out.println("컴퓨터가 실행중 입니다.");
	}
	
	public void powerOff() {
		System.out.println("컴퓨터가 종료중 입니다.");
	}
}

class Samsung extends Computer{
	// 자식 클래스
	
	// 오버라이딩 : 부모가 가진 기능을 똑같은 이름으로 내가 새롭게 만든다.
	
	// 어노테이션 사용해보기
	// 사용 목적 : 컴파일 오류 방지, 가독성 향상, 유지보수 용이성
	// 어노테이션 : @기호를 사용하고 컴퓨터에게 이 코드는 이렇게 다뤄줘라고 알려주는 것이다.
	// > powerOn 메서드는 반드시 오버라이딩을 해야해, 부모에 powerOn이 있는지 검사해줘
	
	@Override		// 오버라이딩 어노테이션
	public void powerOn() {
		// 부모도 자식도 똑같은 메서드를 가지고 있다.(오버라이딩)
		// 부모의 powerOn도 실행하고 자식의 powerOn도 실행하겠다.
		super.powerOn();
		System.out.println("삼성 컴퓨터가 실행이 됐습니다");
	}
	
	@Override
	public void powerOff() {
		System.out.println("삼성 컴퓨터가 종료가 됐습니다.");
	}
}

class Phone {
	String brand;
	int series;
	String color = "검정색";
	
	// 생성자 선언
	// > 생성자는 선언과 동시에 실행되는 초기설정을 할 때 많이 사용된다.
	Phone(String brand, int series, String color) {
		this.brand = brand;
		this.series = series;
		this.color = color;
	}
	
	// 생성자 오버로딩
	Phone(String brand, int series) {
		// 컬러에 검정색이라는 기본 값을 사용할꺼라 색상은 안 받아온다.
		// 나는 위에 3개의 매개변수를 받는 생성자를 여기서 실행보겠다.
		// 생성자 this : 내가 가진 생성자를 실행 시켜라
		this(brand, series, "파란색");
	}
	
	public void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}

class Loading {
	// 하나의 요소 ( 메서드 add 이름 하나 )로 여러가지 메서드를 만들 것이다.
	public void add() {
		// 1) 매개변수가 없는 add
		System.out.println("첫 번째 add 메서드 입니다.");
	}
	
	public void add(int a) {
		// 2) 매개변수가 한 개 있는 add
		System.out.println("두 번째 add 메서드 입니다.");
	}
	
	public void add(int a, int b) {
		// 2) 매개변수가 두 개 있는 add
		System.out.println("세 번째 add 메서드 입니다.");
	}
	
	public void add(int a, double b) {
		// 매개 변수가 두 개 있으면서 타입을 다르게 만든 add
		System.out.println("네 번째 add 메서드 입니다.");
	}
	
	public void add(double a, int b) {
		// 매개 변수가 두 개 있으면서 타입도 다르고, 순서도 바꾼 add
		System.out.println("다섯 번째 add 메서드 입니다.");
	}
}

class Parents {
	// 부모 클래스
	int number = 30;
	public void hello() {
		System.out.println("안녕하세요, 부모 클래스 입니다.");
	}
}

class Child extends Parents {
	// 자식 클래스
	
}

class Encap {
	// 캡슐화를 사용하는 방법
	// 1) 나는 이 필드를 아무나 아무렇게 사용하는 것을 막을 것이다.
	private String id;
	private String password;
	
	// 2) 접근자 메서드를 사용해서 수정 및 가져가서 사용할 수는 있게 만든다.
	// 2-1) setter : 필드의 값을 수정하는 메서드
	public void setPassword(String password) {
		// 접근자 메서드를 사용하면 좋은점
		// 잘못된 값을 검증하거나, 잘못된 사용자가 접근하는 것을 막는 권한 검증을 할 수 있다.
		this.password = password;
	}
	
	// 2-2. getter : 필드의 값을 반환하는 메서드
	public String getPassword() {
		return password;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
}
