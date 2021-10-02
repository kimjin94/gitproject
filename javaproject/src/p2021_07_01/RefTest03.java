package p2021_07_01;

class Parent03 { // 부모클래스
	public void parentPrn() {
		System.out.println("슈퍼 클래스 : ParentPrn 메서드");
	}
}

class Child03 extends Parent03 { // 자식클래스
	public void childPrn() {
		System.out.println("서브 클래스 : ChildPrn 메서드");
	}
}

class RefTest03 {
	public static void main(String[] args) {
		Parent03 p = new Child03();	 // 업캐스팅(자동형변환)
		// 서브 클래스로 인스턴스 선언
		p.parentPrn();				// 상속해준 매소드만 호출 가능함
		// p.childPrn();			//-컴파일 에러
		
		
		Child03 c; 					// 서브 클래스로 레퍼런스 변수 선언
		System.out.println("---------------->>");
		// 서브 클래스 레퍼런스 변수에 슈퍼 클래스의 레퍼런스 값이 대입됨
		
		c = (Child03) p; 			// 강제 형변환으로 다운 캐스팅
		
		Child03 ch1 = (Child03) p;
		
		c.parentPrn();
		c.childPrn();
	}
}