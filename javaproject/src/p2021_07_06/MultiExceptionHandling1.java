package p2021_07_06;

public class MultiExceptionHandling1 {
	public static void main(String[] args) {

//   try ~ catch ~ finally
//   finally 안에 들어 있는 내용은 예외가 발생하든, 발생하지 않든 무조건 실행된다.

		int value = 20;
		int div = 0;

		int[] intArray = { 1, 2, 3 };

		try {
			// 두수의 나눗셈을 구함
//			int result = value / div;		// 예외 발생
//			System.out.println(result);

			// 배열의 특정 값을 저장
			int arrayValue = intArray[4];	// 예외 발생	2를 넣을 시 예외 발생은 않았지만 finally는 실행됨
			System.out.println(arrayValue);

		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());

		} catch (ArrayIndexOutOfBoundsException ai) {
			ai.printStackTrace();

		} finally {
			System.out.println("예외가 발생했음!");

		}
	}
}
