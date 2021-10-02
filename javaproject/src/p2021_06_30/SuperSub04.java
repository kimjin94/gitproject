package p2021_06_30;

class Point2D4 {					// 부모 클래스 : 상위, 슈퍼	클래스
	protected int x = 10; // private int x = 10;		// protected는 상속에서 자주 쓰임
	protected int y = 20; // private int y = 20;		// private은 상속(접근)을 차단한다
}

class Point3D4 extends Point2D4 {	// 자식클래스 : 하위, 서브, 파생, 클래스
	protected int z = 30;

	public void print() {
		System.out.println(x + ", " + y + "," + z);
	}
}

class SuperSub04 {
	public static void main(String[] args) {
		Point3D4 pt = new Point3D4();
		pt.print();
	}
}