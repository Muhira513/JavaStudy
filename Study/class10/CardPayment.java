//package kr.co.koreait.class10;
//
//public class CardPayment implements Payment{
//	// 미완성으로 규칙만 지정해둔 메서드를 여기서 완성을 할 것이다.
//	
//	// 인터페이스와 클래스 파일을 서로 연결 시켰다.
//	// > 인터페이스에 미완성으로 만들어둔 메서드를 모두 구현을 해야 합니다.
//	
//	static int CardMoney = 5000000;
//	
//	public void pay(int amount) {
//		if(CardMoney >= amount) {
//			// 내 카드 잔액이 더 많을 경우
//			CardMoney -= amount;	// 카드 잔액 - 상품 가격
//			System.out.println("===================");
//			System.out.println("카드 결제 완료!");
//			System.out.println("잔액 : " + CardMoney);
//			System.out.println("===================");
//		} else {
//			System.out.println("===================");
//			System.out.println("카드 잔액이 부족합니다.");
//			System.out.println("잔액 : " + CardMoney);
//			System.out.println("===================");
//		}
//	}
//}
