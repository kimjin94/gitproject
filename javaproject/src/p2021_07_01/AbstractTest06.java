package p2021_07_01;

interface IHello06 { 	// 인터페이스
	int a = 10; 		// 상수	: public static final 생략되어 있음

	public abstract void sayHello(String name);	// 추상메소드
}

interface IGoodBye06 {									// 인터페이스
	public abstract void sayGoodBye(String name);		// 추상메소드
}

// 인터페이스끼리 상속을 받을 때 extends로 받아야되고, 다중상속도 가능하다.
interface ITotal extends IHello06, IGoodBye06 {		// 인터페이스끼리 상속받으면 메소드오버라이딩은 안된다.
	public abstract void greeting(String name);		// 추상메소드
}

class SubClass06 implements ITotal {		//	마지막에 상속받 것에 오버라이딩 가능함 만약3개면 3개 전부해야함
	public void sayHello(String name) {				//메소드 오버라이딩
		System.out.println(name + "씨 안녕하세요!");
	}

	public void sayGoodBye(String name) {			//메소드 오버라이딩
		System.out.println(name + "씨 안녕가세요!");
	}

	public void greeting(String name) {				//메소드 오버라이딩
		System.out.println(name + ", 안녕!");
	}
}

class AbstractTest06 {
	public static void main(String[] args) {
		SubClass06 test = new SubClass06();
		test.sayHello("홍길동");			//메소드 오버라이딩된 메소드 호출
		test.sayGoodBye("이순신");		//메소드 오버라이딩된 메소드 호출
		test.greeting("진");				//메소드 오버라이딩된 메소드 호출
	
	System.out.println(IHello06.a);	//10
//	IHello06.a = 30; // 상수 - 수정불가	a는 상수이기 때문에 값을 수정할 수 없다.
		
	}
}