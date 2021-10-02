package p2021_06_22;

public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	p148

//	String 객채
//	== : 참조하는 주소를 비교
//	equals() : 참조하는 값(대어터)을 비교 // 나중에 많이 쓰임

		String str1 = "자바";
		String str2 = "자바";

		if (str1 == str2) { // 비교연산자(==)로 참조하는 주소를 비교
			System.out.println("같은 주소"); // 같은 주소
		} else {
			System.out.println("다른 주소");
		}

		String str3 = new String("자바");
		String str4 = new String("자바");

		if (str3 == str4) { // 다른 주소
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}

		if (str1 == str3) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}

		if (str1.equals(str2)) {// 참조하는 값(데이터)을 비교
			System.out.println("참조하는 값이 같다.");
		} else {
			System.out.println("참조하는 값이 다르다.");
		}
		if (str3.equals(str4)) {// 참조하는 값(데이터)을 비교
			System.out.println("참조하는 값이 같다.");
		} else {
			System.out.println("참조하는 값이 다르다.");
		}
		if (str1.equals(str3)) {// 참조하는 값(데이터)을 비교
			System.out.println("참조하는 값이 같다.");
		} else {
			System.out.println("참조하는 값이 다르다.");
		}
		boolean b = "자바".equals("파이썬");
		if(b) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
		if("오라클".equals("스프링")) {
			System.out.println("같은 값");
		}else {
			System.out.println("다른 값");
		}
			
		
	}

}
