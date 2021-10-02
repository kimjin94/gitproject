package p2021_06_28;

public class AppendStringBuffer {
	public static void main(String[] args) {

		// StringBuffer 객체 생성
		StringBuffer sb1 = new StringBuffer("gemini");
		System.out.println("sb1 = " + sb1);

		// StringBuffer sb1에 문자열을 추가해 새로운 객체 생성
		StringBuffer sb2 = sb1.append(" is beautiful"); // 시작의 주소값은 변경되지 않는다.
		System.out.println("sb2 = " + sb2);
		System.out.println("sb1 = " + sb1);
		if (sb1 == sb2) {	// 주소값을 비교
			System.out.println("같은 주소");
		} else {
			System.out.println("다른주소");
		}

		// 정수형 데이타 형을 추가
		System.out.println(sb1.append(1004));
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);

		String str = new String(sb1); // StringBuffer를 String으로 변환
		System.out.println(str.toUpperCase());
	}
}
