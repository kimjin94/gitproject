package p2021_06_24;

class StaticTest4 {
	private static int a = 10;		// 정적 필드
	private int b = 20;

	public static void printA() {	// 정적 메소드
		System.out.println(a);		// 정적 메소드안에서 정적 필드만 사용가능함
//		System.out.println(b); // 컴파일 에러 발생
	}

	public void printB() {
		System.out.println(b);
		System.out.println(a);		// 일반 메소드는 정적필드와 일반 필드도 사용 가능함
	}
}

public class StaticTest04 {
	public static void main(String[] args) {
		StaticTest4.printA();
		StaticTest4 s1 = new StaticTest4();
		StaticTest4 s2 = new StaticTest4();
		s1.printB();
		s2.printB();
	}
}