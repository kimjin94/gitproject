package p2021_06_18;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 1부터 10까지 합으 구하는 프로그램을 작성하세요.
		int sum = 0;	// 지역 변수(local variable) i=1도 지역 변수 
		for(int i=1; i<=10; i++) {
			sum = sum + i; // sum += i; 
//			 1	=  0 +	1
//			 3	=  1 +	2
//			 6	=  3 +	3
//			 10	=  6 +	4
//			 15	=  10+	5
//					:		
//					:
			System.out.println("1~"+i+"="+sum);
		}
//		System.out.println(i); i는 for문 안에서 만 가능
		System.out.println("sum="+sum);
		
	}

}
