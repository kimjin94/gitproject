package p2021_06_30;

class Point2D05 { 				// 부모클래스
	protected int x = 10; 		// 필드
	protected int y = 20;

	public Point2D05() { 		// 기본생성자 - 메개변수 없는것
		System.out.println("슈퍼 클래스인 Point2D 생성자 호출");
	}
}

class Point3D05 extends Point2D05 { 	// 자식클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + "," + z);
	}

	public Point3D05() {				// 기본 생성자	// 자식 클래스에서 메개변수 & 기본 생성자이든 상관없다
		System.out.println("서브 클래스인 Point3D 생성자 호출");
	}
}

class SuperTest05 {
	public static void main(String[] args) {
		Point3D05 pt = new Point3D05();
		pt.print();			// 생성자 호출
	}
}