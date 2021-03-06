package p2021_07_01;

abstract class AbstractClassB{		// 추상 클래스
	abstract void Method01();		// 추상 메소드

	void Method02(){				// 일반 메소드- 사용시 오버라이딩 받은값  / 미사용시 상속받은값
	   System.out.println("Method02: 추상클래스에서 구현");
	 }
}

abstract class MiddleClass extends AbstractClassB{
//	void Method01(){				// 메소드 오버라이딩
//	  System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
//	}
	
	public void Method03(){
	  System.out.println("Method03: 추상클래스에서 구현");
	}
}

class SubClassB extends MiddleClass{
	void Method01(){			// 메소드 오버라이딩
	  System.out.println("Method01: 서브클래스에서 구현된 추상메소드");
	}
}

class AbstractTestB{
	public static void main(String args[]){
	   SubClassB obj =  new SubClassB();
	   obj.Method01();		// 메소드 오버라이딩된 메소드 호출
	   obj.Method02();		// 상속받은 Method02()를 호출
	   obj.Method03();		// 상속받은 Method03()를 호출
	 }
}


