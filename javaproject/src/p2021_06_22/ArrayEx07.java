package p2021_06_22;

public class ArrayEx07 {

//	절대값을 구해주는 메소드
	static int abs(int data) {
		if (data < 0)
			data = -data; // 음수 값을 양수값으로 돌려주는 식
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		args[0] = "-10", args[1] = "-20" 이때는 숫자는 문자임으로 숫자로 형변환해야 한다.
		System.out.println("args[0]:" + args[0]);
		System.out.println("args[1]:" + args[1]);

		// args[0] = "-10" --> -10 : 형변환
		int num = Integer.parseInt(args[0]); // 절대값식 // int num = -10; 임
		System.out.println("절대값:" + abs(num)); // abs를 호출 //abs(-10)을 return해서 10으로 돌려준다.
	} // 2번째 자료형 변환 예시 int <---> String
		// Wrapper 클래스는 문자 20을 숫자 20으로 변환 시킬때 사용한다.

}
// Arguments에  Program arguments에 값을 지정해주고 run을 누른다.