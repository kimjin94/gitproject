package p2021_06_30;

class Point2D { 							// 부모 클래스 : 공통적인 내용
	private int x;							// 필드
	private int y;

	public int getX() {						// 메소드
		return x;
	}

	public void setX(int new_X) {
		x = new_X;							// x 에 10을 할당 받아서 그 값을 저장
	}

	public int getY() {
		return y;
	}

	public void setY(int new_Y) {
		y = new_Y;							// y 에 20을 할당 받아서 그 값을 저장
	}
}

// 부모클래스 안엔 있는 필드와 메소드는 상속이 된다.

class Point3D extends Point2D { 			// 자식클래스
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int new_Z) {
		z = new_Z;							// z에 할당 받아서 그값을 저장
	}
}

class SuperSub00 {
	public static void main(String[] args) {

		Point3D pt = new Point3D();
		pt.setX(10); // 상속받아 사용
		pt.setY(20); // 상속받아 사용
		pt.setZ(30); // 자신의 것 사용
		System.out.println(pt.getX()		// 상속받아 사용
				+ ", " + pt.getY()			// 상속받아 사용
				+ ", " + pt.getZ());		// 자신의 것 사용
	}
}