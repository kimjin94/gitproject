package p2021_06_22;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	p154	

		int[] scores; // 주소값은 없고 새로운 공간이 없음
		scores = new int[] { 83, 90, 87 }; // 새로운 공간 생성 이때 in[]scores는 주소값을 얻는다. // 두줄예시 // =은 전달하는 뜻

//		int[] scores = new int[] {83,90,97};	// 한줄예시	// 한줄은 new int[]는 생략가능

		int sum1 = 0; // 합이 누적 되는 변수 sum1
		for (int i = 0; i < 3; i += 1) {
			sum1 += scores[i];
		}
		System.out.println("총합:" + sum1); // 총합 : 260

//		add메소드를 호출해서 리턴된 총점을 sum2에 저장
		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println("총합:" + sum2);

	}// main () end

//	사용자 정의 메소드 : 합을 구해주는 메소드
	public static int add(int[] scores) { // add는 사용자가 직접 호출 // 받는 값과 돌려주는 값은 즉 자료형이 int형이면 int형으로 받는다.
		int sum = 0; // 배열(int[]scores)은 {83, 90, 87}을 전달 받는다. 나중에 굉장히 중요해짐.
		for (int i = 0; i < 3; i += 1) {
			sum += scores[i];
		}
		return sum; // 호출된 값을 되돌려 주는 것
	}

}
