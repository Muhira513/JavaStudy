package kr.co.koreait.class2;

public class User {
	// User 클래스는 '데이터 객체'로 사용할 것이다.
	// > 데이터만을 모아두는 목적으로 사용하는 클래스이다.
	
	private String name;
	private int age;
	private String address;
	private String birth;
	private boolean isMarried;
	private double height;
	private String id;
	private String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public boolean isMarried() {
		return isMarried;
	}
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	// getter, setter를 자동으로 만들어주는 이클립스 기능
	// 의문 : isMarried 필드만 getter에 이름이 이상하다 ( get이 안붙었다 )
	// getter에서는 is가 붙은 내용은 get이 생략된다.
	// -> 굳이 지켜도 되지 않을 규칙
	
	
	
//	// getter
//	public String getName() {
//		return name;
//	}
//	
//	// setter
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	// getter
//	public int getAge() {
//		return age;
//	}
//	
//	// setter
//	public void setAge(int age) {
//		this.age = age;
//	}
}
