package kr.co.koreait.class8;

public class Product {
	
	String productName;		// 상품 이름
	int productPrice;		// 상품 가격
	int productQty;			// 상품 수량
	
	// 상품 정보 저장
	public void setProduct(String name, int price, int qty) {
		productName = name;
		productPrice = price;
		productQty = qty;
	}
	
	// 총 금액 반환
	public int getTotalPrice() {
		return productPrice * productQty;
	}
	
	// 영수증 출력
	public void print() {
		System.out.println("상품명 : " + productName);
		System.out.println("가격 : " + productPrice);
		System.out.println("수량 : " + productQty);
		System.out.println("총 금액 : " + getTotalPrice());
	}
}
