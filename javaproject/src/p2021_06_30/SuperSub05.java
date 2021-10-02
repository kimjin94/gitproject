package p2021_06_30;

//	super : 부모 클래스를 의미함
//	부모클래스에 은닉된 메소드를 호출 할때 자식클래스의 메소드 안에서
//  super.parentPrn() 형식으로 호출해야 한다.
//	super.은 나중에 잘 사용하지않음

class Parent05 {					// 부모 클래스
	public void parentPrn() {		// 은닉메소드
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

//Parent를 슈퍼 클래스로 하는 서브 클래스 Child 정의 
class Child05 extends Parent05 {	// 자식 클래스
	// 슈퍼 클래스에 있는 ParentPrn 메서드를 오버라이딩하면
	// Child로 선언된 객체는 슈퍼 클래스의 메서드가 은닉되어 상속 받지 못하게 된다.
	public void parentPrn() {		// 메소드 오버라이딩(Method Overriding)	-	상속이 전제 메소드 호출해서 안의 내용이 다르게하는것
		System.out.println("서브 클래스 : ParentPrn 메서드");
	}

	public void childPrn() {		
		super.parentPrn();	// 부모클래스에 은닉된 메소드 호출
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

class SuperSub05 {
	public static void main(String[] args) {
		Child05 c = new Child05(); // 서브 클래스로 객체를 생성
		c.parentPrn(); // 오버라이딩된 서브 클래스의 메서드 호출
		c.childPrn(); // 서브 클래스 자기 자신의 메서드 호출
		System.out.println("-------------------------------------------->> ");
		Parent05 p = new Parent05(); // 슈퍼 클래스로 객체를 생성
		p.parentPrn(); // 슈퍼 클래스(자기 자신)의 메서드 호출
	}
}
