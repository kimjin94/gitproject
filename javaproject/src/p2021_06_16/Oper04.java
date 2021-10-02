package p2021_06_16;

public class Oper04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 비교 연산자 : >, >=, <, <=, ==(같다), !=(같지않다)
// 바교 연산자의 결과가 참이면true, 거짓이면 false값을 리턴한다.
		
		String str1= "자바";		// 사용 빈도 높은 Class - String
		String str2= "자바";
		String str3= new String("자바");

		// 비교 연산자로 주소값을 비교
		if(str1 == str2) {		// 같은 주소
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}		
		
		if(str1 == str3) {		// 다른 주소
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}		
	
		// 값을 비교
		System.out.println(str1.equals(str2));		// true
		System.out.println(str1.equals(str3));		// true
		
		
	}
}
