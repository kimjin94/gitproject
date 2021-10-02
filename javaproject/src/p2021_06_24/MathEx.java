package p2021_06_24;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Math 클래스
//		Math 클래스 = 정적필드 + 정적 메소드 / 생성자는 없다.
		
//		Math 클래스는 생성자가 제공되지 않기 때문에 Math클래스로 직접 객체를 
//		생성할 수 없다.
		
//		Math m = new Math(); // 생성자가 없어서 오류가 일어난다.
				System.out.println("E="+ Math.E);
				System.out.println("PI="+ Math.PI);
				
				System.out.println("abs()="+ Math.abs(-10));		// 절대값
				System.out.println("ceil()="+ Math.ceil(3.14));		// 올림기능
				System.out.println("round()="+ Math.round(10.5));	// 반올림기능
				System.out.println("floor()="+ Math.floor(10.5));	// 내림기능
				System.out.println("max()="+ Math.max(10, 20));		// 최대값
				System.out.println("min()="+ Math.min(10, 20));		// 최소값
				System.out.println("pow()="+ Math.pow(2,3));		// 제곱
				
				// 0.0 <= Math.random() < 1.0 범위의 난수 발생
				System.out.println("random()="+ Math.random());		// 난수
				System.out.println("sqrt()"+ Math.sqrt(5));			// 루트  제곱근
				
				
	}

}
