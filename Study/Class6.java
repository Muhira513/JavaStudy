package kr.co.koreait.class6;

/*import java.util.Arrays;*/
/*import java.util.Comparator;*/

public class Class6 {

	public static void main(String[] args) {
		// 오늘의 핵심 : 배열과 2차원 배열을 사용하고 이해해보기
		// 기존 변수는 하나의 공간에 하나의 값만 넣을 수 있었다.
		// 1. 배열 사용방법
		/* int[] arr = new int[4]; */
		// 정수형 배열을 선언했고, 공간의 크기는 4개를 가진다.
		
		// 배열 : 같은 자료형 가진 데이터를 하나로 묶어서 관리한다.
		// 인덱스 : 배열 내의 각 요소에 접근하기 위해 사용되는 번호
		// > 인덱스는 간단하게 순서를 얘기하는 것이다.
		
		// 인덱스로 값을 초기화 하는 방법
		/* arr[0] = 10; */	// 0번 인덱스 -> 첫번째 방(순서)이다.
		/* arr[1] = 20; */	// 1번 인덱스 -> 두번째 방(순서)이다.
		/* arr[2] = 30; */	// 2번 인덱스
		/* arr[3] = 40; */	// 3번 인덱스
		// 0번부터 시작하는 이유 : 컴퓨터는 항상 숫자를 처음부터 셀 때 0부터 시작한다.
		
		/*
		 * System.out.println("0번 인덱스 조회 : " + arr[0]);
		 * System.out.println("1번 인덱스 조회 : " + arr[1]);
		 * System.out.println("2번 인덱스 조회 : " + arr[2]);
		 * System.out.println("3번 인덱스 조회 : " + arr[3]);
		 */
		
		// 배열을 사용하면 하나의 공간에 여러 개의 값을 넣을 수 있다.
		// 주의 : 같은 데이터 타입의 데이터만 넣을 수 있다.
		// 주의2 : 우리가 4개의 공간을 만든다고 하면, 공간은 4개로 고정된다.
		// 배열 범위를 초과해서 사용하면 오류가 발생한다.
		
		// 2. 반복문을 사용해서 배열에 값을 하나씩 넣어보기
		// numbers라는 이름의 int형 배열을 만들고, 크기는 10개
		/* int[] numbers = new int[10]; */
		// new 연산자 : 참고형(객체형) 데이터를 메모리에 올려주는 역할을 한다.
		
		// 반복문을 사용해서 랜덤한 숫자를 넣어주겠다.
//		for(int i = 0; i < numbers.length; i++) { // 초기식, 조건식, 증감식
//			// length : 배열의 크기를 가져와주는 메서드(기능)
//			numbers[i] = (int)(Math.random() * 30) + 1;
//			// 각 배열마다 랜덤한 숫자를 넣어주고 있다.
//		}
		
		// 반복문으로 값을 하나씩 꺼내보기
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.println("배열의 출력 : " + numbers[i]);
//		}
		
		// 만약에 배열을 그대로 출력하면 모든 값이 나오지 않을까?
		/* System.out.println(numbers); */	// 배열 자체를 출력하면 어떻게 되는가?
		// 참조형 자료 ( 배열 )를 출력하면 우리가 원하는 데이터 값이 나오지 않는다.
		
		// 3. 배열에다가 점수를 넣고, 평균 점수를 구하는 프로그램
		/* int[] nums = new int[4]; */
		// 0번 인덱스 : 국어 점수
		// 1번 인덱스 : 영어 점수
		// 2번 인덱스 : 수학 점수
		// 3번 인덱스 : 과학 점수
		
		/*
		 * nums[0] = 90; 
		 * nums[1] = 70; 
		 * nums[2] = 80; 
		 * nums[3] = 75;
		 */
		
//		for(int i = 0; i < nums.length; i++) {
//			System.out.println("각 배열의 값 : " + nums[i]);
//		}
		
//		int sum = 0; // 배열 안에 값들을 모두 더해서 여기서 넣는다.
//		for(int i = 0; i < nums.length; i++) {
//			sum += nums[i]; // 복합 대입 연산자 > sum = sum + nums[i]
//		}
		
		// 평균 계산하기
		/* double avg = (double)sum / nums.length; */
		// 형변환 : 기존 데이터 타입을 다른 데이터 타입으로 바꿔주는 행동
		// int형 sum을, double형 sum으로 바꿔라
		
		/* System.out.println("평균 점수 : " + avg); */
		
		// 4. 배열의 명시적 초기화와 배열의 유용한 기능들(Arrays)
		// 배열의 넣어야 할 값을 미리 알 경우 명시적 초기화를 사용하는게 더 편하다.
		// arr[] 배열에 100, 200, 300 3개의 데이터를 바로 넣고 싶다.
		/* int arr[] = { 100, 200, 300 }; */
		// 배열에 넣어야 하는 값을 바로 알고 있거나, 넣어야 하는 데이터 적을 경우 편하다.
		
		// Arrays = java에서 제공해주는 배열을 위한 기능들의 모음이다.
		// 1) toString() : 배열을 문자열 형태로 변환해서 출력해주는 메서드(기능)
		/* int[] numbers = new int[10]; */
		
//		for(int i = 0; i < numbers.length; i++) {
//			numbers[i] = i;
//			// 각 인덱스에 반복 횟수(i)의 값이 들어간다.
//		}
		
		/* System.out.println(Arrays.toString(numbers)); */
		// toString 기능을 사용해서 배열을 출력하면 안에 있는 모든 내용을 출력
		// > 정확하게는 우리가 볼 수 있게 문자열로 변환을 해주는 것이다.
		
		// 2) sort() : 배열에 저장된 값을 오름차순으로 정렬해주는 메서드(기능)
		// 오름차순 : 낮은 수 -> 높은 수 
		// 내림차순 : 높은 수 -> 낮은 수
		
		/* int[] nums = new int[10]; */
		
		// 반복문으로 랜덤한 숫자를 10개 넣겠다. ( 1 ~ 100 )
//		for(int i = 0; i < nums.length; i++) {
//			nums[i] = (int)(Math.random() * 100) + 1;
//		}
		
		/* System.out.println(Arrays.toString(nums)); */
		// Arrays의 sort() 기능 사용하기
		/*
		 * Arrays.sort(nums); 
		 * System.out.println("오름차순 정렬 : " + Arrays.toString(nums));
		 */
		
		// 우리가 직접 코드로 정렬을 하거나 또는 출력을 할수 있다.
		// > 이미 만들어져 있는 기능을 활용하는 것이 더 중요하다.
		
		// 3) 내림차순 정렬
		
		/* Integer[] numbers = new Integer[10]; */
		// int와 똑같은 것이다. Integer는 참조형(객체형) 자료형이다.
//		for(int i = 0; i < numbers.length; i++) {
//			numbers[i] = (int)(Math.random() * 100) + 1;
//		}
		
		/*
		 * System.out.println(Arrays.toString(numbers)); 
		 * Arrays.sort(numbers,Comparator.reverseOrder()); 
		 * System.out.println("내림차순 정렬 : " + Arrays.toString(numbers));
		 */
		
		// reverseOrder() : 정렬 순서를 반대로 바꿔주는 메서드(기능)
		
		// Wrapper Class ( 래퍼 클래스 )
		// > 기본형 데이터 타입을 참조형 데이터 타입처럼 사용할 수 있게 포장해주는 역할 
		// int -> Integer
		// double -> Double
		// boolean -> Boolean
		
		// 의문 : 왜 기존 데이터 타입을 참조 데이터 타입으로 포장해서 사용해야 하는가?
		// 기본형 데이터 타입을 사용할 수 있는 기능도 있고, 사용을 못하는 기능도 있다.
		// 컴퍼레이터 기능은 일반 기본형 타입은 사용할 수 없게 만들어져서 Integer를 사용했다.
		
		// 5. 배열 복사
		// 1) 특정 기능을 사용하지 않고 for문으로 복사하기
		/* int[] origin = { 1, 2, 3, 4, 5 }; */ // 원본 배열
		/* int[] copy = new int[origin.length]; */
		
//		for(int i = 0; i < origin.length; i++) {
//			copy[i] = origin[i];
//		}
//		System.out.println(Arrays.toString(copy));
		
		// 2) arraycopy()
		// > 원본과 새로운 배열의 길이를 자세하게 원하는 만큼 복사가 가능한 메서드
		/* System.arraycopy(origin, 0, copy, 0, origin.length); */
		// 1) 복사할 원본 배열
		// 2) 복사를 시작할 위치(인덱스)
		// 3) 저장할 배열 
		// 4) 저장을 시작할 위치(인덱스)
		// 5) 복사할 요소의 개수
		
		/* System.out.println(Arrays.toString(copy)); */
		
		// 3) ** Arrays.copyOf() ** 
		// > 배열 복사를 할 때 가장 많이 사용되는 메서드 
		/*
		 * int[] card = { 3, 1, 4, 5, 10 }; 
		 * int[] newCard = Arrays.copyOf(card, card.length);
		 */
		// 어떤 배열을 복사 할 것인가? , 복사할 길이
		/* System.out.println(Arrays.toString(newCard)); */
		
		// 복사 기능을 사용하는 가장 큰 이유
		// > 원본 데이터를 보존하기 위해서
		
		// > Arrays를 활용한 점수 정렬 프로그램 만들기 ( 원본 데이터 보존 )
		/* int[] scores = new int[8]; */
		
		// 랜덤한 점수를 저장
//		for(int i = 0; i < scores.length; i++) {
//			scores[i] = (int)(Math.random() * 101);
//		}
		// 기존 배열을 복사해서 저장했다.
		/* int[] origin = Arrays.copyOf(scores, scores.length); */
		
		// 점수 정렬 전
		/* System.out.println("정렬 전 점수 : " + Arrays.toString(scores)); */
		
		// 점수 정렬
		/* Arrays.sort(scores); */
		
		// 점수 정렬 후
		/* System.out.println("정렬 후 점수 : " + Arrays.toString(scores)); */
		
		// ==================================================================================
		// 6. 2차원 배열
		// > 1차원 배열을 행과 열의 형태로 구성하여 표처럼 나타낼 수 있는 배열
		
		/* int[][] arr = new int[2][3]; */	// 2개의 행, 3개의 열
		
//		arr[0][0] = 10;
//		arr[0][1] = 20;
//		arr[0][2] = 30;
//		
//		arr[1][0] = 100;
//		arr[1][1] = 200;
//		arr[1][2] = 300;
		
		/*
		 * System.out.println(arr[0][1]); 
		 * System.out.println(arr[1][2]);
		 */
		
		// 2차원 배열이 사용되는 곳
		// 열과 행의 형태의 데이터를 담아두기 위해서 사용한다.
		// > 표 형태
		
		// Arrays.toString으로 2차원 배열을 꺼내서 출력하고 싶다.
		/*
		 * System.out.println(Arrays.toString(arr[0]));
		 * System.out.println(Arrays.toString(arr[1]));
		 */
		
		// 2차원 배열을 명시적 초기화 하는 방법
		/* int[][] arr = {{10, 20, 30},{40, 50, 60}}; */
		
		// ========================================================================
		//7. 향상된 for문 ( for-each )
		// > 배열이나 컬렉션의 모든 요소를 간단하게 순회할 때 사용한다.
		// > 하나씩 접근해서 값을 출력할 때 많이 사용된다. ( 조회용 )
		/* int[] nums = {10, 20, 30, 40}; */
		
		// 항샹된 for문 간단하게 출력
//		for(int i : nums) {
//			System.out.println(i);
//		}
		
		// int i는 for문에서 사용하는 변수이며, nums의 값을 하나씩 저장한다.
		// nums : 반복문의 반복 횟수는 배열의 길이만큼 반복을 한다.
	}
	

}
