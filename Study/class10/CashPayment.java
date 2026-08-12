//package kr.co.koreait.class10;
//
//public class CashPayment implements Payment{
//	// Payment 인터페이스 파일로 부터 규칙을 강제받는다.
//	static int cashMoney = 100000;
//	
//	public void pay(int amount) {
//	if(cashMoney >= amount) {
//		// 내 카드 잔액이 더 많을 경우
//		cashMoney -= amount;	// 카드 잔액 - 상품 가격
//		System.out.println("===================");
//		System.out.println("현금 결제 완료!");
//		System.out.println("잔액 : " + cashMoney);
//		System.out.println("===================");
//	} else {
//		System.out.println("===================");
//		System.out.println("현금 잔액이 부족합니다.");
//		System.out.println("잔액 : " + cashMoney);
//		System.out.println("===================");
//	}
//}
//	
//}
