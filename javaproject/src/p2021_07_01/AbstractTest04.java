package p2021_07_01;

interface IHello04 { // 인터페이스
	public abstract void sayHello(String name); // 추상메소드(public abstract생략)
}

abstract class GoodBye04 { // 추상클래스
	public abstract void sayGoodBye(String name); // 추상매소드(public abstract불가)
}

// 클래스와 인터페이스를 동시에 상속을 받을 때는 클래스를 먼저 상속 받고, 그런다음에 
// 인터페이스를 나중에 상속을 받아야한다.(상속받는 순서가 바뀌면 오류가 생긴다.)
class SubClass04 extends GoodBye04 implements IHello04 { // 상속받는건 추상or일반 클래스 그후 인터페이스 순서 바뀌면 오류 발생
	public void sayHello(String name) {
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {
		System.out.println(name + "씨 안녕히 가세요!");
	}
}

class AbstractTest04 {
	public static void main(String[] args) {
		SubClass04 test = new SubClass04();	// 구형 클래스 호출
		test.sayHello("홍길동");			//메소드 오버라이딩 된 메소드를 호출한다.
		test.sayGoodBye("이순신");		//메소드 오버라이딩 된 메소드를 호출한다.
	}
}