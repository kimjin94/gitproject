package p2021_06_16;

public class Oper03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 비교 연산자 : >, >=, <, <=, ==(같다), !=(같지않다)
// 바교연산자의 결과가 참이면true, 거짓이면 false값을 리턴한다.
		
		int num1 =10;
		int num2 =10;
		
		boolean result1 = (num1 == num2); 	// ture
		boolean result2 = (num1 != num2); 	// false
		boolean result3 = (num1 <= num2); 	// ture
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
		
		System.out.println(num1 < num2); 	// false
		
		char c1 = 'A'; 	// 65
		char c2 = 'B'; 	// 66
		boolean result4 = (c1 < c2); 	
		System.out.println("result4:"+result4); 	// result4:true (아스키코드로 비교)
		
	}

}
