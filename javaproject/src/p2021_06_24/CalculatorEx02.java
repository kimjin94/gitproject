package p2021_06_24;

//	p232
//	메소드 오버로딩(Method Overloding)
//	: 한개의 클래스 안에 동일한 이름을 가진 메소드를 여러개 정의 한 것.
//	메소드 오버로딩 조건 : 매개변수의 데이터 타입, 갯수, 순서

class Calculator2{
	double areaRectangle(double width) {
		return width* width;	// 정사각형 넓이 구하는 식
	}
	double areaRectangle(double width, double height) {
		return width*height;
	}
}


public class CalculatorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator2 mycal = new Calculator2();
		
		// 정사각형 넓이 구하기 식
		double result1 = mycal.areaRectangle(10);
				
		// 직사각형 넓이 구하기
		double result2 = mycal.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이"+result1);
		System.out.println("직사각형의 넓이"+result2);
	}

}
