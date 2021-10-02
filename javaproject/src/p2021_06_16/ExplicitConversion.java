package p2021_06_16;

//	강제 형변환(틀린 예제)
public class ExplicitConversion {

	public static void main(String[] args) {

		// int형 변수를 97로 초기화
		int intValue = 97;

		// char형 변수에 int형 변수 값을 할당
		char charValue = intValue;		// (char)inValue;로  강제 형변환 시킴
		System.out.println("charValue = " + charValue); // 97 -> a로 변환됨

		// float형 변수 초기화.
		float floatValue = 3.14F;

		// int형 변수에 float형 변수 값을 할당
		int intValue2 = floatValue;		// (int)floatValue;로 강제 형변환
		System.out.println("intValue2 = " + intValue2); // 3.14 -> 3로 변환되어 데이터 손실이 발생

		// float형 변수 초기화
		double doubleValue = 21.12345;

		// float형 변수에 double형 변수 값을 할당
		float floatValue2 = doubleValue; // (float)doubleValue;로 강제 형변환
		System.out.println("floatValue3 = " + floatValue2); // 결과는 같음 하지만 소수점길이가 길어지면 반올림되어 소수점 6자리까지만 나옴
		// doubl형을 int로 변환시키는게 많음
	}
}