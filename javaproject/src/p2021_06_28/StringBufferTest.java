package p2021_06_28;

public class StringBufferTest {
	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("gemini");				// 새로운 값의 변화가 일어나면 String은 주소값이 변경되지만 String Buffer는 변하지 않는다.
		System.out.println("sb1.length() : " + sb1.length());		// 문자의 글자 수 출력
		System.out.println("sb1.capacity() : " + sb1.capacity());	// 출력된 글자 용량 단위 기준 byte

		sb1.append("A string buffer implements" + "a mutable sequence of characters");	// 기존단위에 추가는 코드및 동적으로 용량을 늘려줌
		System.out.println("sb1.length() : " + sb1.length());		
		System.out.println("sb1.capacity() : " + sb1.capacity());

		StringBuffer sb2 = new StringBuffer();		// 기본생성자
		System.out.println("sb2.length() : " + sb2.length());		// 0 
		System.out.println("sb2.capacity() : " + sb2.capacity());	// 16byte 기본 데이터가 없어도 기본적으로 용량을 주어진다.
	}
}
