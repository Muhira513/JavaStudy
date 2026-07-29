package kr.co.koreait.class5;

import java.util.Random;
import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 제어문의 2가지 종류 / 조건문과 반복문이 있다.
		// 오늘의 핵심 목표 : 반복문의 2가지 종류를 사용해보고 각 차이점을 볼 것이다.
		// 1. for문
		// > 반복문을 얘기할 때 대부분 for문을 연상하며 사용한다.
		// >> 반복할 횟수를 알고 있을 경우 for문을 사용한다.
		
		/*
		 * for(int i = 0; i < 10; i++) { 
		 * // 이 반복문은 10번 정도 반복을 하게 만들었다.
		 * System.out.println("현재 숫자는 " + i + " 입니다"); 
		 * }
		 */
		// 반복문을 구성하는 3가지 요소
		// 1) 초기식 : int i = 0;
		// > 반복 횟수와 관련된 변수를 선언하였다. ( i의 값은 반복문 안에서만 사용 가능하다. )
		// 반복문에 초기식 이름은 i 라고 전통적으로 작성(다른 변수 이름으로 해도 상관없음(필수가 아님))
		// 2) 조건식 : i < 10;
		// > 조건식은 몇번 정도 반복을 할지 정하는 식이다. ( true라는 값이 나와야 실행한다. )
		// 3) 증감식 : i++
		// > 조건식이 통과되고 실행까지 완료되면 i의 값이 1 증가 시킨다.
		
		// 1-1. 1부터 100까지 모든 숫자를 합 계산 하고 싶다.
		
		/* int sum = 0; */ // 모든 합계산의 숫자를 저장할 것이다.
		
		// 반복문 1부터 시작해서 100까지 반복하는 반복문을 만들 것이다.
		/*
		 * for(int i = 1; i <= 100; i++) { 
		 * sum += i; // 복합 대입 연산자 : sum = sum + i; 
		 * }
		 */
		/* System.out.println("모든 합계산은 : " + sum); */
		
		// 1-2. 스캐너 입력을 받아서 몇번 정도 반복하는지 정해보겠다.
		
		/*
		 * System.out.print("반복할 횟수를 입력하세요 : "); 
		 * int num = sc.nextInt();
		 */
		
		// 보통 i의 값을 0으로 세팅하는 사람들이 꽤 많다.
		// i의 값을 1로 시작할 때는 i의 값을 출력하거나, 계산에 사용될 때 많이 사용된다.
		/*
		 * for(int i = 1; i <= num; i++) { 
		 * System.out.println("현재 반복 횟수는 " + i + " 입니다"); 
		 * }
		 */
		
		// 1-3. 스캐너로 문자열을 입력받고, 문자열의 길이 만큼 반복 시키겠다.
		// > length() : 문자열이나 배열이나 컬렉션 등의 길이를 우리에게 반환(전달)
		
		/*
		 * System.out.println("문자열의 길이 만큼 반복할 경우 : "); 
		 * String str = sc.nextLine();
		 */
		
		/*
		 * for(int i = 1; i <= str.length(); i++) { 
		 * System.out.println("현재 반복 횟수는 " + i + " 입니다."); 
		 * }
		 */
		
		// 1-4. 사용자에게 입력을 받고 몇번 반복할지 정하는 것이다.
		// 1) sc.nextInt()를 통해서 숫자를 입력 받는다. / int num
		// 2) for문을 3가지 요소를 작성해주세요 ( 초기식, 조건식, 증감식 )
		// > i의 값은 1부터 시작
		// 3) 출력
		
		/* System.out.print("숫자를 입력해주세요 : "); */
		
		/* int num = sc.nextInt(); */
		
		/*
		 * for(int i = 1; i <= num; i++) { 
		 * System.out.println(i + "번 반복했습니다"); 
		 * }
		 */
		
		// 1-5. 짝수를 출력하는 프로그램을 만들 것이다.
		// for 문과 if문을 섞어서 사용을 해보도록 하겠습니다.
		
		// 짝수 판별 : 변수 % 2 == 0
		// 홀수 판별 : 변수 % 2 == 1
//		for(int i = 1; i <= 20; i++) {
//			if(i % 2 == 0) {
//				System.out.println("짝수의 값 : " + i);
//			}
//		}
		
		// 1-6. 로또 번호를 생성하는 프로그램 만들기
//		Random random = new Random();
//		
//		for(int i = 0; i < 6; i++) {
//			int lottoNumber = random.nextInt(45) + 1;
//			System.out.print(lottoNumber + " ");
//		}
		// nextInt() : 랜덤한 숫자를 반환(전달)해주는 기능
		// 의문 : 왜 뒤에다가 +1을 적었는가?
		// > 컴퓨터는 시작할 때 0부터 시작하기 때문에 0 ~ 44까지 숫자에다가 1을 증가시켜준 것이다.
		
		// 2. 중첩 for문
		// > for문 안에 또 다른 for문이 사용되는 구조 
		// 주의 : 중첩 for문은 성능상, 안전상 많이 사용되지는 않는다.
		
		// 2-1. 숫자 카운트
//		int count = 0;
//		
//		for(int i = 0; i < 3; i++) {
//			// 첫 번째 반복문은 3번 반복 ( 0, 1, 2 )
//			for(int j = 0; j < 5; j++) {
//				// 두 번째 반복문은 5번 반복 ( 0, 1, 2, 3, 4 )
//				count++;
//			}
//		}
//		System.out.println("반복 횟수 : " + count);
		
		// 2-2. 중접 for문을 활용해서 구구단 2단~9단까지 출력하겠다.
		
//		for(int i = 2; i <= 9; i++) {
//			System.out.println("[" + i + "단]");
//			
//			for(int j = 1; j <=9; j++) {
//				System.out.println(i + " x " + j + " = " + (i*j));
//			}
//			System.out.println();	// 단 사이 줄바꿈
//		}
		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		
//		for(int i = 1; i <= 5; i++) {
//			for(int j = 1; j <= 5-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		// 중첩 for문의 주의점
		// 1) 많이 사용하거나 깊어질수록 코드 이해 난이도가 높아지고 실수가 많아진다.
		// 2) 성능 문제 ( 반복 횟수 폭발 
		// 3) 디버깅이 어렵다.
		
		// ================================================================================
		// 3. while문
		// > 조건식으로만 구성되어 있으며, 반복할 횟수를 모를 경우 사용한다.
		// 매우매우 주의 : 사용할 때 '무한 루프'에 빠지지 않게 조심해야한다.
		
//		int count = 0;
//		while(count < 10) {
//			System.out.println("현재 반복 횟수 : " + count);
//			count++;	// 멈추는 조건이다
//		}
		
		// 무한 루프 : while문에서 끝나는 조건을 제대로 기입하지 않으면 멈추지 않고 계속 반복
		// 1) 프로그램이 종료되지 않는다.
		// 2) CPU 자원을 계속 사용하게 된다.
		// 3) 메모리/로그가 계속 쌓여서 문제가 발생할 수 있다.
		
		// 10초동안 무한하게 반복하는 while문을 만들 것이고, 값이 얼마나 증가
		/* int count = 0; */
		
		// 무한하게 반복하는 반복문이고, 몇번 반복했는지 알려준다.
//		while(true) {
//			count++;
//			System.out.println("현재 반복 횟수 : " + count);
//		}	// 10초 동안 반복을 했는데 670만 정도 반복을 했다.
		
		// 4. do-while문
		// > 조건식과 상관 없이 최초 1번은 무조건 실행하는 while문이다.
		
//		do {
//			// 반복을 해야하는 코드를 넣어둔다.
//			System.out.println("조건식과 상관없이 무조건 1번은 실행한다.");
//		} while(false);
		
		// 메뉴 선택
//		int menu;
//		
//		do {
//			System.out.println("1. 시작");
//			System.out.println("2. 설정");
//			System.out.println("3. 종료");
//			System.out.println("4. 프로그램 종료");
//			
//			menu = sc.nextInt();
//		} while(menu != 4);	// menu 변수가 숫자 4만 아니면 무조건 반복된다.
		
		// ==================================================================================
		// 5. 제어문 : 제어문 2가지 키워드를 사용할 것이다.
		// 1) continue문
		// 2) break문
		
		// 5-1. continue 키워드
		// > 현재 반복을 건너뛰고 처음으로 돌아가라 ( 생략 )
		
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			// 1부터 시작, 100까지 반복 ( 100번 반복 )
//			
//			// 조건 : 짝수는 출력하고, 홀수는 누적합을 하겠다 ( 짝수 생략 )
//			if(i % 2 == 0) {
//				System.out.println(i + "는 짝수입니다.");
//				System.out.println("반복문의 처음으로 돌아갑니다.");
//				continue;
//			}
//			sum += i;	// 홀수만 더해준다.
//		}
//		System.out.println("sum의 합계 : " + sum);
		
		// continue 키워드 : 실행되면 뒤에 실행되는 코드는 무시하고 다음 반복으로 넘어가라
		
		// 메서드 : 만들어둔 기능으로 형태는 메서드 이름() : length()
		// 키워드(예약어) : 문자 그자체로 기능을 가진 것들
		
		// 5-2. break문
		// > 반복문 안에서 break를 사용하면 어떤 조건식이든 상관없이 무조건 반복문을 종료한다.
//		int sum = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i % 2 == 0) {
//				System.out.println(i + "는 짝수입니다.");
//				System.out.println("반복문을 종료합니다.");
//				break;
//			}
//			
//			sum += i;
//		}
		
		// break 키워드 : 어떤 조건이든 break가 실행되면 반복문은 그자리에서 강제 종료된다.
		
//		int cnt = 0;
//		while(true) {
//			cnt++;
//			
//			if(cnt == 10) {	// cnt 변수가 숫자 10이 되는 순간 강제 종료
//				break;
//			}
//			System.out.println(cnt);
//		}
		
		// 숫자 맞추기 게임
//		int magicNum = (int)(Math.random() * 30) + 1;
		// 1 ~ 30까지의 랜덤한 숫자를 제공해준다.
//		
//		boolean isMatched = false;
		// 맞췄는지, 못맞췄는지 데이터로 표시한 것이다.
//		
//		for(int i = 1; i <= 10; i++) {
//			System.out.println("찾는 숫자를 입력해주세요 : ");
//			int guess = sc.nextInt();
//			
//			if(guess == magicNum) {
//				System.out.println(i + "번 째에 맞추셨습니다.");
//				isMatched = true;
//				break;
//			} else if(guess > magicNum) {
//				System.out.println("맞춰야 할 숫자가 더 작습니다.");
//			} else if(guess < magicNum) {
//				System.out.println("맞춰야 할 숫자가 더 큽니다.");
//			}
//			
			// 결국 10번 안에 못 맞췄을 경우
//			if(!isMatched) {
//				System.out.println("숫자를 맞추지 못했습니다.");
//				System.out.println("==================");
//			}
//		}
	}

}
