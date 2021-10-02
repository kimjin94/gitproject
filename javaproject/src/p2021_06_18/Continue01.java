package p2021_06_18;

public class Continue01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// continue문
// 1.다시 반복문으로 돌아가라는 의미를 가지고 있음.
// 2.continue문이 실행되면, continue문 아랫쪽의 내용들은 실행되지 않고 (즉 해당 조건의 값은 출력되지않는다.)
//	 다시 반복문으로 돌아가게 된다.

		for (int i = 1; i <= 10; i += 1) {
			if (i == 5)
				continue; // 조건식if와 함깨 많이 쓰임 break문 보다는 적게쓰임
			System.out.println("출력:" + i);
		}

	}

}
