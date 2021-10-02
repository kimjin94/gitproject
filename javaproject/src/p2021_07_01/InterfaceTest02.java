package p2021_07_01;

interface IHello02 { // 인터페이스
	public abstract void sayHello(String name);	// 추상메소드
}

interface IGoodBye02 {	// 인터페이스
	public abstract void sayGoodBye(String name);// 추상메소드
}

//두 인터페이스로부터 상속을 받는 클래스 설계 : 인터페이스의 다중상속
class SubClass02 implements IHello02, IGoodBye02 {
	public void sayHello(String name) {			 // 메소드 오버라이딩
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");// 메소드 오버라이딩
	}
}

class InterfaceTest02 {
	public static void main(String[] args) {
		SubClass02 test = new SubClass02();
		test.sayHello("홍길동");			// 메소드 오버라이딩된 메소드 호출
		test.sayGoodBye("이순신");		// 메소드 오버라이딩된 메소드 호출
	}
}