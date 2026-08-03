package kr.co.koreait.class7;

/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;*/

public class Class7 {

	public static void main(String[] args) {
		// 오늘의 핵심 목표 : 컬렉션 프레임워크를 사용하는 것이다.
		// 배열의 장점 : 하나의 공간에다가 여러 값을 담을 수 있다.
		// 배열의 단점 : 한번 공간을 정하면 후에 공간을 늘리거나 줄일 수 없다.
		
		/* int[] arr = new int[5]; */ // 이 배열의 공간(크기)은 5개이다.
		
		// 1. 컬렉션 프레임워크
		// 컬렉션 : 동일한 데이터 타입을 묶어서 관리하는 자료 구조이다.
		// > 저장 공간의 크기를 동적으로 관리할 수 있다.
		// - 굳이 저장 공간을 지정할 필요가 없다.
		// - 컬렉션 안에 들어있는 데이터의 수많은 자동으로 공간이 늘어나거나 줄어든다.
		
		// 2. List 
		// > 순서가 있으며, 중복을 허용한다.
		// - 순서가 있다는 말은 인덱스로 값을 수정하거나 꺼내올 수 있다.
		// - 똑같은 데이터가 중복되어도 상관없다.
		// 2-1. ArrayList
		// > 컬렉션 프레임워크에서 가장 많이 사용되는 컬렉션 자료형이다.
		// > 배열과 매우 유사하다
		
		/* ArrayList<Integer> list = new ArrayList<>(); */
		// 해석
		// 1) ArrayList<Integer>
		// <> : 꺾쇄괄호는 제네릭이라고 불리는 것으로 제네릭 안에는 사용하는 데이터 타입을 넣어둔다.
		// 래퍼클래스 Integer를 사용했다. -> int를 사용한다.
		// 래퍼클래스는 기본형 타입을 참조형처럼 보이게 포장만 해주는 클래스이다.
		// 2) list : 나는 이 컬렉션 프레임워크를 list라는 이름으로 사용하겠다.
		// 3) new 연산자 : 참조형 데이터를 메모리에 올려주는 역할을 한다.
		
		// 값을 추가하는 메서드 : add();
		/*
		 * list.add(1); 
		 * list.add(2); 
		 * list.add(7);
		 */
		// add함수를 사용하면 데이터를 리스트의 끝에 추가하면서 공간도 늘려준다.
		
		/* list.add(1, 10); */// 1번 인덱스에 10을 넣겠다.
		/* System.out.println("리스트 전체 출력 : " + list); */
		// 컬렉션 프레임워크의 장점 : list를 그냥 출력하니깐 안에 있는 모든 값이 출력된다.
		// 출력을 하면 자동으로 toString으로 전체 리스트를 보여준다.
		
		// 리스트에 값을 삭제하는 메서드 : remove();
		/* list.remove(1); */ // 1번 인덱스의 값을 삭제해줘
		/* System.out.println("리스트 값 삭제후 출력 : " + list); */
		/* System.out.println("리스트의 크기 : " + list.size()); */
		
		// ArrayList 여러가지 사용해보기
//		ArrayList<Integer> dataList = new ArrayList<>();
		
//		dataList.add(50);
//		dataList.add(60);
		
//		ArrayList<Integer> list = new ArrayList<>();
		
//		list.add(50);
//		list.add(2);
//		list.add(2);
//		list.add(2);
		
		// list 컬렉션에 dataList의 데이터를 붙혀줄 것이다.
//		System.out.println("붙여주기 전 : " + list);
//		list.addAll(dataList);
//		System.out.println("붙여주기 후 : " + list);
		
		// 일치하는 데이터를 모두 삭제 한다.
		// dataList는 50과 60의 값을 가지고 있다.
//		list.removeAll(dataList);
//		System.out.println("일치하는 데이터 삭제 후 : " + list);
		
		// 데이터를 초기화해주는 메서드 : clear();
//		list.clear();
//		System.out.println("초기화 실행 후 : " + list);
		
		// 정리 - ArrayList는 List를 기반으로 만들어진 컬렉션 프레임워크
		
		// 1) ArrayList 일반 선언
		/* ArrayList<Integer> list1 = new ArrayList<>(); */
		// - 우리는 학습 목적으로 일반 선언 방법을 많이 사용 할 것이다.
		// 사용 이유 : ArrayList만의 기능을 사용하고 싶을 때 일반 선언을 사용하기도 한다.
		
		// 2) List 업 캐스팅 선언 방법
		/* List<Integer> list2 = new ArrayList<>(); */
		// > 바라보는 것을 부모인 List인데 사용하는 것은 ArrayList를 사용한다.
		// - 실무에서 거의 대부분의 개발자들이 이 업캐스팅 방법으로 많이 사용한다.
		// 사용 이유 : 나중에 구현체(뒤에 ArrayList)를 변경할 때 쉽다.
		
		// - 6의 배수만 리스트에 추가하는 방법
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		for(int i = 1; i <= 200; i++) { // 200번 반복
//			if(i % 6 == 0) {
				// i 와 6을 나누고 나머지 값이 0일 경우에만 조건문이 실행
//				list.add(i);
//				
//			}
//		}
		
//		System.out.println(list);
		// 리스트에서 특정 값을 꺼내오는 메서드 : get()
		// list에서 0번 인덱스의 값을 가져와라
//		System.out.println(list.get(0));
		
		// 값을 추가 : add()
		// 값을 꺼내오는 것 : get()
		// 값을 삭제 : remove()
		// - 특정 컬렉션을 제외하고 대부분 위와 같은 메서드를 사용한다.
		
		// 2-2. LinkedList
		// - list를 기반으로 만들어진 구현체(자식)
		
		// 기존 ArrayList와 차이점
		// ArrayList : 데이터 추가/삭제 작업이 많을 수록 느리다, 데이터 조회는 빠르다.
		// LinkedList : 데이터 추가/삭제 작업이 빠르다., 데이터 조회 속도는 느리다.
		
		// 특징 : 데이터를 연결하는 방식이 기존 ArrayList와 다르다.
		// > 노드와 포인터로 데이터를 연결한다.
		
		/* LinkedList<Integer> linked = new LinkedList<>(); */
		/* linked.add(100); */
		/* linked.add(200); */
		/* linked.add(0, 50); */	// 0번 인덱스에 50의 값을 추가
		/* System.out.println(linked); */
		
		// =============================================================================================================
		// 3. Set : 순서가 없으며, 중복을 허용하지 않는다. ( 리스트의 정반대 )
		// 3-1. HashSet : 순서가 보장되지 않고, 중복을 허용하지 않는다.
//		HashSet<Integer> hashSet = new HashSet<>();
//		
//		hashSet.add(1);		
//		hashSet.add(2);		
//		hashSet.add(2);		
//		hashSet.add(3);		
//		hashSet.add(3);			
//		
//		System.out.println(hashSet);
		// 중복되는 값이 새로 추가되면, 무시한다.
		// 순서가 보장되지 않는다 라고 했는데, 순서대로 나오고 있다.
		// JDK 버전이나, 컴퓨터의 환경, 테스트 환경에 따라서 순서대로 나올 수도 있고, 뒤죽박죽 나올 수도 있다.
		
		// Set가 사용되는 상황
		// > 중복 제거 용도 : 로그인 ID, 이메일, 학번
		
		// > - 중복된 출석 번호 제거하기
//		int[] input = {1, 3, 5, 3, 2, 1, 4};
//		
//		HashSet<Integer> list = new HashSet<>();
//		
//		// 항샹된 for문 ( for-each문 )
//		// 컬렉션이나 배열같이 여러 값이 모여 있는 데이터에 순회하는 용도로 사용
//		for(int num : input) {
//			// 반복 횟수 : input에 데이터 수만큼 자동으로 반복( 7번 ) 
//			if(list.contains(num)) {
//				// contains() : 컬렉션 안에 값이 동일한 값이 존재하는지 검사 메서드
//				System.out.println(num + "번은 이미 출석 처리된 번호입니다.");
//			} else {
//				list.add(num);
//				System.out.println(num + "번 출석 처리 완료");
//			}
//		}
		
		// Set는 중복된 값을 제거하거나 걸러낼 때 사용하는 컬렉션
		// 거의 사용되지 않는다.
		
		// ========================================================================================
		// 4. Map : Key와 Value가 쌍으로 하나의 데이터를 이룬다.
		// > Key값은 중복이 안되고, value값은 중복이 가능하다.
		// > 순서가 없다.
		
		
//		HashMap<Integer, String> map = new HashMap<>(); 
//		
		// Map에 값을 추가하는 방법 : put()
//		map.put(1, "Tom");
//		map.put(2, "Alice");
//		map.put(3, "Jane");
		// Map 컬렉션에 있는 데이터를 수정하거나 꺼낼 때는 Key값을 사용한다.
//		System.out.println("전체 Map 출력 : " + map);
//		System.out.println("2번 키값 : " + map.get(2));
		// 2 키값과 연결되어 있는 데이터를 가져온다.
//		
//		map.remove(3); // 3과 연결된 데이터 값은 없어진다.
//		System.out.println("삭제 후 : " + map);
//		
		// Map의 Key값만 꺼내오는 방법 : keySet()
//		System.out.println(map.keySet());
		
		// HashMap을 사용하는 이유
		// Map의 사용빈도는 ArrayList와 동등하거나 또는 더 높을 수 있다.
		// 직관적으로 데이터를 빠르게 찾아서 사용하고 싶을 때 Map을 많이 사용한다.
		
		// 컬렉션 중에서 가장 많이 사용되는 2가지
		// 1) ArrayList
		// 2) HashMap
		
		// 본인 또는 가상의 인물 정보를 저장해보기
		/* HashMap<String, String> my = new HashMap<>(); */
		// Key 값도 String, Value값도 String으로 사용
		/*
		 * my.put("name", "Alice"); 
		 * my.put("age", "17"); 
		 * my.put("addr", "대한민국 ....");
		 * my.put("memberId", "260803");
		 */
		
		/* System.out.println(my); */
		
		// 향상된 for문
//		for(String key : my.keySet()) {
//			System.out.println("Key : " + key + ", Value : " + my.get(key));
//		}
		
		// 여러가지 컬렉션 프레임워크 사용해보았다.
		// 하나의 공간에다가 여러 개의 데이터를 담을 수 있는 자료구조
		// > 크기가 데이터의 수의 따라서 동적으로 관리된다.
		
		
		// 제일 중요한 프레임 워크(컬렉션) 2가지
		// ArrayList
		// HashMap
	}

}
