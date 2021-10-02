package p2021_06_30;

// 자동호출이 안될때

class Point2D06 {					// 부모 클래스		
	protected int x = 10;
	protected int y = 20;

//	매개변수가 있는 생성자가 있을때에는 예외적으로 컴파일러가 기본생성자를 
//	생성해 주지 않는다.
	public Point2D06( ){ 			// 기본생성자 - 주석으로 막으면 오류발생
		System.out.println("슈퍼 클래스인 Point2D 생성자 호출"); 
		}
	
	public Point2D06(int xx, int yy) {
		x = xx;		//x = 50;
		y = yy;		//y = 60;
	}
}

//	super()
//	1. super()는 부모클래스의 매개변수를 가진 생성자를 호출한다.
//	2. super()는 자식클래스의 생성자안에서 첫번째 라인에 사용한다.
//	3. super()를 이용해서 부모클래스의 매개변수를 가진 생성자를 호출하면,
//		더이상 부모클래스의 기본생성자를 호출해주지 않는다.


class Point3D06 extends Point2D06 {		// 자식클래스
	protected int z = 30;

	public void print() {		// 자식클래스의 매소드
		System.out.println(x + ", " + y + "," + z);
	}

	public Point3D06() {			//부모 클래스에 기본생성자가 없으면 실행 불가	/ 자식 클래스는 기본 생성자, 매개변수를 사용한다.
//	super(50, 60);					// 부모클래스의 생성자 호출	/ super(50, 60);은 변경된 값 
		System.out.println("서브 클래스인 Point3D 생성자 호출");	
	}
}

class SuperTest06 {
	public static void main(String[] args) {
		Point3D06 pt = new Point3D06();
		pt.print();			// 자식 생성자 호출로 자동으로 부모생성자도 호출된다.
	}
}