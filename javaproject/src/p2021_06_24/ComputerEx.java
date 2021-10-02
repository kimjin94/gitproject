package p2021_06_24;

//	p 220 ~ 221

class computer {

	// 주소값 전달에 의한 메소드 호출 (Call by Reference방식)
	int sum1(int[] values) {	// valuse자리에 자료형 구조나 클래스가 많이옴
		int sum = 0; // 지역변수
		for (int i = 0; i < values.length; i += 1) {
			sum += values[i];
		}
		return sum;
	}

	// ... = vargus : 전달된 값은 배열로 받음
	int sum2(int... values) {
		int sum = 0;	// 지역변수
		for (int i = 0; i < values.length; i += 1) {
			sum += values[i];
		}
		return sum;
	}

}

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computer com = new computer();

		int[] valuse1 = { 1, 2, 3 };
		int result1 = com.sum1(valuse1); // sum1() 메소드 호출
		System.out.println("result1:" + result1);

		int result2 = com.sum1(new int[] { 1, 2, 3, 4, 5 });
		System.out.println("result2:" + result2);

		int result3 = com.sum2(1, 2,3);
		System.out.println("result3:" + result3);

		int result4 = com.sum2(1, 2, 3, 4, 5);
		System.out.println("result4:" + result4);
	
	}

}
