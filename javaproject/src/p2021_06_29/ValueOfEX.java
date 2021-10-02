package p2021_06_29;

// p511
// valueof() : 기본 자료형값을 문자열로 변환
//				ex) 20 ---> "20"

public class ValueOfEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = String.valueOf(10);	// 10 ---> "10"
		String str2 = String.valueOf(10.5);	// 10.5 ---> "10.5"
		String str3 = String.valueOf(true);	// ture(논리값) ---> "true"
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
	}

}
