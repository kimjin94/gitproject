package p2021_07_06;

public class ExceptionEx3 {

	public static void main(String[] args) {
		int var = 50;		// args[0] = "5" 예외발생않함
							//  args[0] = "a" 예외발생
		try {				//args[0] = "0"	예외 발상
			int data = Integer.parseInt(args[0]);

			System.out.println(var / data);

			// Exception 예외 클래스가 하위 예외 클래스들을
			// 모두 가지고 있기 때문에 먼저 정의해서는 안된다.

		} catch (NumberFormatException ne) {
			System.out.println("숫자가 아닙니다.");
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌순 없죠?");
		} catch (Exception e) { // 예외처리를 할때 최상위인 Exception는 항상 마지막에 온다.
			System.out.println("Exception !!");
		}
		System.out.println("프로그램 종료!");
	}
}
