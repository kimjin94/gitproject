package p2021_06_21;

public class MethodEX01 {

//	사용자 정의 메소드(자바의 경우 위치에 상관없이 호출이 가능하다. 객채지향언어인 경우 그리고 메소드안에 메소드를 중첩으로 사용은 불가능하다.)
//	사용자 정의 메소드는 프로그래머가 직접 호출해야만 실행된다.
	static void check() { // static : 정적 메소드
		System.out.println("메소드 호출 성공");
		return; // return 생략가능
	}

//	값 전달에의한 메소든 호출(Call by value방식)
	static void check(int a) { // 매개변수(parameter) int a = 30;
		System.out.println("전달된 값:" + a); // 매개변수는 지역변수에 속함
	}

	static void check(int a, double d) { // 메소드 오버로딩- 한개의 메소드안에 여러가지의 메소드를 호출하는 것
		double result = a + d;
		System.out.println("전달된 값의 합:" + result);
	}

	static void check(char c) { // char c = 'A';
		System.out.println("전달된 값:" + c);
	}

	static void check(boolean b) { // boolean b = true;
		System.out.println("전달된 값:" + b);
	}

//	주소값 전달에 의함 메소드 호출방식(Call by Reference방식)
	static void check(String s) { // Sting s = "자바";
		System.out.println("전달된 값:" + s); // String s = new String("파이썬")
	}

//	return문 : 메소드를 호출한 곳에 값을 돌려주는 역할
//	return문은 메소드 가장 마지막 줄에 사용한다.
	static int check01() {
		System.out.println("출력");
		return 50;	
	}
	
	static double check02(int a, double d) {
		double result = a + d;
		return result;
	}
	
	
//	main() 메소드는 자바 가상머신(java.exe)으로만 호출 된다.
//	main() 메소드는 프로그래머가 직접 호출 할 수 없다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEX01.check(); // check() 메소드 호출 - 클래스명 생략가능
		check();
		check(30);
		check(10, 20.5);
		check('A');
		check(true);
		check("자바");
		check(new String("파이썬"));
		check01();	// return문으로 돌려받은 값이 출력되지 않는다.
		int result = check01();
		System.out.println("돌려 받은 값1:"+result);
		System.out.println("돌려 받은 값2:"+check01());
		double result2 = check02(50, 3.14);
		System.out.println("돌려 받은 값3:"+result2);
		System.out.println("돌려 받은 값4:"+check02(50, 3.14));
		
		
		
		
	}

}
