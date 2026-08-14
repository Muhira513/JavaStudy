package kr.co.koreait.class2;

//import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		// 객체 지향 프로그래밍 4대 특징 중 2가지를 구현할 것이다.
		// 1. 캡슐화
		// > 변수와 메서드를 클래스로 묶어서 불필요한 정보를 노출시키지 않는 개념이다.
		// 목적 : 정보를 아무나 아무렇게 사용할 수 없게 만들고, 잘못된 사용을 방지하기 위해.
		
		// Tom 클래스를 t라는 이름으로 사용할 수 있다. : 객체 선언
//		Tom t = new Tom();
		// 만약에 age 라는 정보가 사용하면 안되는 중요한 정보일 경우
//		int age = t.age;
//		System.out.println("저의 나이는 " + age + "살입니다.");
		
		// 접근자 메서드 - getter, setter
		// > private로 보호한 필드(변수)를 가져와서 사용하거나 수정하게끔 도와주는 메서드
		// getter : 필드의 값을 가져올 때 사용한다.
		// setter : 필드의 값을 수정할 때 사용한다.
		
//		t.setAge(-35);
//		System.out.println("Tom의 나이는 " + t.getAge() + "입니다.");
		
//		t.setAge(20);
//		System.out.println("Tom의 나이는 " + t.getAge() + "입니다.");
		
		// - age라는 필드를 아무렇게 막 가져와서 수정하고 삭제하는 것을 막고 싶다.
		// > 필드의 private로 보호를 했다.
		// - private를 사용하니깐 나도 사용을 할 수 없다.
		// > get, set를 만들어서 사용할 수 있게 만들어줬다.
		// age 필드를 사용하고 싶으면 내가 만들어둔 get, set 메서드를 사용해서 가져가라
		// - 잘못된 값(나이의 경우 음수의 나이)이 들어가는 것을 막고 싶다.
		// > setter에 조건문을 넣어두었다.
		
		// 캡슐화를 구현하는 방법 : private와 getter, setter를 사용한다.
		 
		// Account 클래스를 만든다.
//		Account account = new Account();
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("이름을 입력해주세요 : " );
//		String owner = sc.nextLine();
//		System.out.println("금액을 입력해주세요 : " ); 
//		int money = sc.nextInt();
//		
//		// 입력받은 값을 Account에 setter로 전달을 할 것이다.
//		account.setOwner(owner);
//		account.setMoney(money);
//		
//		// 정보 출력
//		account.printInfo();
		
		// 참조 변수 this
		// > this 키워드는 매개변수와 필드의 이름이 같을 때 사용되는 것이다.
		// 필드의 이름을 정확하게 지정할 때 사용하는 것이다.
		// Ex. 매개변수 owner, 필드 owner, owner = owner
		// -> 매개변수 owner에 매개변수 owner를 넣어라
		// Ex. this.owner = owner
		// -> 내가 가지고 있는 owner에 매개변수 owner를 넣어라
		
		// 매개변수와 필드의 이름을 똑같이하면 직관적이기 때문에 더 편하다.
		
		//=========================================================================
		// 2. 상속
		// > 클래스와 클래스에게 부모와 자식 관계를 맺어주고, 자식클래스는 부모 클래스의 모든것을 사용할수 있다.
		// - 부모 클래스가 자식 클래스에게 모든 기능(필드, 메서드, 생성자) 물려줄 수 있다.
		
		// 모든 기능은 Book 클래스에 모여져 있다.
		// Comic은 아무 기능도 없는데, Book의 기능을 사용할 수 있는가?
		// 상속은 자식이 부모의 기능을 사용할 수 있다.
//		Comic c = new Comic();
//		c.title = "포켓몬";
//		c.price = 4500;
//		c.info();
//		c.comicBook();
//		// 자식은 본인만의 기능도 가질 수 있고, 부모의 것도 가져올 수 있다.
//		
//		Book b = new Book();
//		b.title = "해리포터";
//		b.price = 6500;
//		b.info();
		// 부모가 자식이 가지고 있는 기능을 사용할 수 있는가?
//		b.comicBook(); 사용할 수 없다
		// 상속은 부모가 가진 기능을 자식에게 물려주기 때문에 자식만이 물려받아 사용할 수 있다.
		
		// JAVA에서 상속은 단일 상속만 가능하다.
		// 하나의 자식은 하나의 부모만 가질 수 있다.
		// > 즉, 두 명의 부모는 불가능 하다.
		
		// - super 키워드
		// > 부모의 기능을 가져와서 실행한다.
		// super() : 부모의 생성자를 호출(실행)
		// super : 부모의 기능을 호출(실행)한다.
		
//		Customer c1 = new Customer("박자바", 25, 11111);
//		c1.enter();
//		
//		Customer c2 = new Customer("송코딩", 20, 22222);
//		c2.enter();
		
		// 오늘 객체 지향 프로그래밍 4대 특징
		// 캡슐화 : 정보를 은닉하고(private), 잘못된 데이터 삽입을 막는다( getter, setter )
		// 상속 : 부모 클래스가 자식 클래스에게 모든 기능을 물려준다. ( extends )
	}

}

class Human {
	String name;
	int age;
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void hello() {
		System.out.println("방문해주셔서 감사합니다.");
	}
}

class Customer extends Human{
	int memberId;
	
	Customer(String name, int age, int memberId) {
		// super() 기능을 사용해서 2개의 필드를 부모 생성자에 전달해서 저장한다.
		super(name, age);
		this.memberId = memberId;
	}
	
	void enter() {
		// 나는 여기서 부모의 hello() 라는 기능을 실행시키고 싶다.
		super.hello();
		
		System.out.println("회원 번호 : " + memberId);
		System.out.println("(" + name + "," + age + "세)님 입장하십니다.");
		
	}
}

class Book {
	// 부모 역할
	String title;
	int price;
	
	public void info() {
		System.out.println("책의 제목은 " + title + "이고, 가격은 " + price + "원 입니다.");
	}
}

class Comic extends Book {
	// 자식 역할
	// 상속 관계는 자식에다가 부모가 누구인지 적는 것이다.
	public void comicBook() {
		System.out.println("책의 제목은 " + title + "이고, 종류는 만화책 입니다.");
	}
}

class Account {
	// 보호해야 하는 필드
	private String owner; // 예금주
	private int money;	// 잔액
	
	// owner의 getter, setter
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	// money의 getter, setter
	public void setMoney(int money) {
		// 잔액이 0원이나 -(마이너스) 숫자가 되지 않게 만든다
		if(money <= 0) {	// 받아온 num 숫자가 0이거나 0(마이너스)보다 작을 경우
			System.out.println("잔액이 부족합니다, 0원 이하입니다.");
			return;
		} 
		this.money = money;	
	}
	
	public int getMoney() {
		return money;
	}
	
	public void printInfo() {
		if(money <= 0) {
			return;
		} else {
			System.out.println("예금주 : " + owner + ", 잔액 : " + money + "원 입니다.");
		}
	}
	// private : 자기 클래스 안에서만 사용할 수 있다.
}

class Tom {
	// 1) 정보 은닉을 위해서 private 접근 제한자로 막아두었다.
	// > 아무나 아무렇게 가져가서 사용할 수 없다.
	// 정보를 보호하는 것은 좋은데, 문제는 나도 쓸 수 없다.
	private int age = 10;
	
	// 2) 접근자 메서드를 사용해서 age 필드의 값을 가져오거나 수정하게 만든다.
	public void setAge(int num) {
		// setter의 역할 : 값을 수정
		// 잘못된 입력 방지 : 나이는 음수가 될 수 없다.
		if(num <= 0) {
			System.out.println("잘못된 수를 입력하셨습니다. 1 이상의 값을 설정하세요.");
		} else {
			age = num;
		}
	}
	
	public int getAge() {
		// getter 역할 : 값을 불러서 사용
		return age;
	}
}
