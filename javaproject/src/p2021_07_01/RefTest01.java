package p2021_07_01;

class Parent { 							// 부모 클래스
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child extends Parent {			// 상속을 받을 자식 클래스
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

//업캐스팅(자동 형변환)
//1. 서브클래스에서 슈퍼클래스로 형변환 하는것
//2. 참조 가능한 영역이 축소가 된다.
//3. 컴파일러에 의해서 암시적 형변환(자동 형변환) 된다.
class RefTest01 {
	public static void main(String[] args) {
		Child c = new Child();
		c.parentPrn();			// 상속 받은 메소드 호출
		c.childPrn();			
		
		Parent p;		// 선언만 한 상태
		p =  c; // 암시적으로 업 캐스팅이 일어남		//(Parent) 생략가능 

		Parent p1 = new Child();	// 업캐스팅(자동형변환)
		
		// 업캬스팅이 되면 상속해준 메소드만 접근할 수 있다.
		// 업캬스팅이 되면 참조 가능한 영역의 축소가 일어난다.
		p.parentPrn();  // 업 캐스팅 후에는 부모로부터 상속받은 메서드만 호출할 수 있다,
//	    p.childPrn();  //컴파일 에러가 발생하게 된다. 	// 상속을 않한 메소드는 접근 불가
	}
}