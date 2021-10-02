package p2021_06_28;

public class InsertStringBuffer {	// 문자열 중간에 삽입하는 기능
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("gemini is beautiful");
		System.out.println(sb1);

		sb1.insert(10, "very");		// 지정된 숫자 앞에 삽입한다. 저장 하는 것에 차이가 있다.
		System.out.println(sb1);

		sb1.insert(0, 1004);
		System.out.println(sb1);
	}
}
