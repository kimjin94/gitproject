package p2021_06_29;

public class WrapperEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	int형의 변수의 최대값과 최소값	
		System.out.println("max:"+Integer.MAX_VALUE);
		System.out.println("min:"+Integer.MIN_VALUE);
		
//	String형을 int형으로 형변환: "20"--> 20
		int n = Integer.parseInt("20");
		System.out.println(n);		// 20 숫자
		System.out.println(n+10);	// 30 연산가능
//		10진수를 2진수로 받음
		System.out.println("2진수:"+Integer.toBinaryString(10));
//		10진수를 8진수로 받음
		System.out.println("8진수:"+Integer.toOctalString(10));
//		10진수를 16진수로 받음
		System.out.println("16진수:"+Integer.toHexString(10));
		
		
	}

}
