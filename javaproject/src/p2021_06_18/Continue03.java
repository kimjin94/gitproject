package p2021_06_18;

public class Continue03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// continue문을 이용해서 1~100까지 정수 중에서 5의 배수만 출력하는
// 프로그램을 작성하세요.

		for (int i = 1; i <= 100; i += 1) {
			if (i % 5 != 0) // 5의 배수가 아닐 경우
				continue;
			System.out.println("5의 배수:" + i);
		}

	}

}
