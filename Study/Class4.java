package kr.co.koreait.class4;

import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		// 오늘의 핵심 : 조건문을 사용하고 이해할 것이다.
		// 조건문 : 특정 조건을 만족할 경우(조건식이 true) 실행하는 제어문이다.
		
		// 1. if문 
		// >  Java에서 가장 기본이 되는 조건 명령문으로 조건을 검사하고 실행할지 안할지 결정한다.
		
		/* int result = 0; */
		
		// 조건식 : 두 개 이상의 변수나 어떤 데이터를 비교 연산자 등으로 비교하는 식
		// if문은 조건식 안에(소괄호) true의 값이 와야 실행된다.
		/*
		 * if(3 > 2) { 
		 * result = 3; 
		 * }
		 */
		
		/* System.out.println(result); */
		
		// 1-2. 입력을 받아서 조건문을 처리해보기 (Scanner)
		
		// Scanner 사용하는 방법
		// 1) 스캐너의 선언문을 적어야 한다.
		/* Scanner sc = new Scanner(System.in); */
		// 나는 스캐너를 여기 파일에서 사용하고, sc라는 이름으로 사용할 것이다.
		// 2) import를 해주어야 한다. [단축키 : Ctrl + Shitf + o ]
		// > 다른 곳에 있는 기능을 여기 파일로 가져와서 사용하는 방법이 import이다.
		// 3) 각 변수에다가 알맞는 메서드를 사용한다.
		/* System.out.print("숫자를 아무거나 하나 입력해주세요 : "); */
		/* int num1 = sc.nextInt(); */	// nextInt는 숫자를 입력받는 메서드
		/* System.out.println(num1); */
		// sc.next까지는 모두 동일한데 각 데이터 타입에 맞게 메서드 이름을 사용하면 된다.
		// Ex) nextDouble, nextByte, nextLong
		// 문자열을 입력받을 때는 nextLine()을 사용한다.
		
		// 조건 : 사용자로부터 나이를 입력받고, 20세 이상이면 "성인입니다.'
		/*
		 * System.out.print("나이를 입력하세요. : "); 
		 * int age = sc.nextInt();
		 */
		
		/*if(age > 19) {*/
		/*
		 * System.out.println("성인입니다."); 
		 * }
		 */
		
		// 1-3. else문
		// else문 : if문의 확장으로 조건식이 모두 틀렸을 경우 실행되는 조건문
		// 특징 1 : 조건문에 마지막에 사용되는 것이다.
		// 특징 2 : else문은 조건식이 필요없다. -> ( 조건식 ) 
		
		//int num = sc.nextInt();
		
		//if(num > 4) {
			//System.out.println(num + "은 4보다 큽니다.");
		//} else {
			//System.out.println(num + "은 4와 같거나 또는 작습니다.");
		//}
		
		/*
		 * int a = 4; 
		 * int b = 10;
		 */
		
		// 조건 : a가 b보다 클 경우 " a가 b보다 큽니다. " 
		// else : "a가 b와 같거나 작습니다."
//		if(a > b) {
//			System.out.println("a가 b보다 큽니다.");
//		} else {
//			System.out.println("a가 b와 같거나 작습니다.");
//		}
		
		// 간단한 실습 : if-else문을 사용해서 미성년자도 판독하기
		/*
		 * System.out.print("나이를 입력해주세요 : "); 
		 * int age = sc.nextInt();
		 */
		
		// 조건문을 완성
		// if문 : 나이(age)가 성인일 경우, "성인입니다"
		// else문 : 아닐경우 "미성년자 입니다."
		
		//if(age > 19) {
			//System.out.println("성인입니다.");
		//} else {
			//System.out.println("미성년자 입니다.");
		//}
		
		// 1-4. else-if문
		// else if 문은 if문의 확장으로써 추가 조건을 넣을 때 사용한다.
		// 특징 1 : if와 else와 다르게 몇 개든 사용할 수 있다.
		
		/*
		 * System.out.print("나이를 입력하세요 : "); 
		 * int age = sc.nextInt();
		 */
		
//		if(age > 19) {
//			System.out.println("성인 입니다.");
//		} 
//		else if (age > 13) {
//			System.out.println("청소년 입니다.");
//		}
//		else if (age > 6) {
//			System.out.println("어린이 입니다.");
//		} 
//		else {
//			System.out.println("유아 입니다.");
//		}
		
		// 1-5. else-if문을 사용해서 계절을 출력받기
		/* System.out.print("월을 입력해주세요 : "); */
		/* int a = sc.nextInt(); */	// 각 월에 대해서 입력 받을 것이다.
		
//		if(a >= 3 && a <= 5) {	// a가 3보다 크고, a가 5보다 작거나 같은 수 ( 3, 4, 5 )
//			System.out.println("봄");
//		} 
//		else if(a >= 6 && a <= 8) {
//			System.out.println("여름");
//		} 
//		else if(a >= 9 && a <= 11) {
//			System.out.println("가을");
//		} 
//		else if(a == 12 || a > 0 && a <= 2){	// a가 12이거나, a가 2이하 이면 실행해라
//			System.out.println("겨울");
//		} else {
//			System.out.println("해당되는 계절이 없습니다.");
//		}
		// =====================================================================================
		// 2. switch문
		// if문과 함께 조건문으로 검사를 하는 조건문이지만, 사용가능한 연산자는 동등연산자(==)만 가능
		
//		System.out.print("숫자를 입력해주세요 : ");
//		int num = sc.nextInt();
//		
//		switch(num) {	// 스위치는 조건식 안에다가 비교할 변수만 넣어두면 된다.
//		case 1:	// case에 데이터 비교는 어떤 데이터 타입을 사용해도 문제 없다 ( 문자열이든 숫자든 )
//			System.out.println("num은 1입니다.");
//			break;	// break는 여기서 멈춰라 라는 뜻으로 사용된다.
//		case 2:
//			System.out.println("num은 2입니다.");
//			break;
//		default:	// 위 조건이 모두 아닐 경우 실행되는 것이다. ( else문이랑 똑같다 )
//			System.out.println("num은 1도 2도 아닙니다.");
//		}
		
		// 스위치 주의점 : 각 case마다 break를 넣어주지 않으면 계속 다음으로 넘어간다.
		
		// 2-2. 무인카페 주문하기
		/*
		 * System.out.println("메뉴를 선택하세요. : "); 
		 * System.out.println("1 : 아이스 아메리카노");
		 * System.out.println("2 : 카페라떼"); 
		 * System.out.println("3 : 딸기요거트 스무디");
		 */
//		
//		int choice = sc.nextInt();
//		switch(choice) {
//			case 1:
//				System.out.println("아이스 아메리카노를 선택하셨습니다.");
//				break;
//			case 2:
//				System.out.println("카페라떼를 선택하셨습니다.");
//				break;
//			case 3:
//				System.out.println("딸기요거트 스무디");
//				break;
//			default:
//				System.out.println("해당하는 메뉴가 없습니다.");
//		}
		
		// 2-3. 사용자로부터 1 ~ 7 사이의 숫자를 입력받고 주말인지 평일인지 출력해주는 프로그램
		// > 1 ~ 5 입력을 받으면 "평일"
		// > 6 ~ 7 입력을 받으면 "주말"
//		System.out.print("날짜 일을 입력해주세요 : ");
//		int a = sc.nextInt();
//		switch(a) {
//		case 1:
//		case 2:
//		case 3:
//		case 4:
//		case 5:
//			System.out.println("평일");
//			break;
//		case 6:
//		case 7:
//			System.out.println("주말");
//			break;
//		default:
//			System.out.println("잘못된 일을 입력하셨습니다.");
//		}
		
		// 2-4. 문자열로 입력을 받고 스위치 조건문을 사용할 것이다.
		// 1) 문자열로 입력을 받을 것이다. 변수 이름은 menu
		
		// 2) 각각 케이스마다 문자열을 넣을 것이다. ( 커피 / 차 / 주스 )
//		
//		System.out.print("메뉴를 선택하세요 : ");
//		String menu = sc.nextLine();	// 문자열을 입력받을 때 한 줄을 입력 받는 것이다.
//		switch(menu) {
//		case "커피":
//			System.out.println("커피 가격은 3000원 입니다.");
//			break;
//		case "차":
//			System.out.println("차 가격은 2000원 입니다.");
//			break;
//		case "주스":
//			System.out.println("주스 가격은 4000원 입니다.");
//			break;
//		default:
//			System.out.println("해당하는 메뉴가 없습니다.");
//		}
		
		// TMI : 조건문 안에 조건문
//		if(3 > 2) {
//			if(5 > 3) {
//				System.out.println("안녕하세요");
//			}
//			System.out.println("안녕하세요 또 뵙습니다.");
//		}
		
	}

}
