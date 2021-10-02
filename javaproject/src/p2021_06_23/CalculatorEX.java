package p2021_06_23;

// p217 ~ 218 

class Calculator{
	// 메소드
	void poweron() {
		System.out.println("전원을 켭니다.");
		return;			// void가 와서 생략가능
	}
	
	// 값 전달에 의한 메소드 호출 방식(Call by value방식)
	int plus(int x, int y) {	// 지역 변수 : x, y, result
		int result = x + y;
		return result;
//		System.out.println("test");
	}
//	return문: plus() 메소드를 호출한 곳에 값을 돌려주는 역할
//	return문은 메소드 가장 마지막줄에 사용한다.
	
	double divide(int x, int y) {
		double result = (double)x/ (double)y;
		return result;
	
	}

	void poweroff() {
		System.out.println("전원을 끕니다.");
	}
	
}

public class CalculatorEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		cal.poweron();
		
		int result1 = cal.plus(5, 6);
		System.out.println("result1:"+ result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = cal.divide(x, y);		// divide 나누기
		System.out.println("result2:"+ result2);
	
		cal.poweroff();
	}

}
