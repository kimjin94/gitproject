package p2021_06_28;

import java.util.StringTokenizer;

class StringTest04 {

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("이순신#을지문덕#강감찬#광개토대왕", "#");	// 전체 문자를 2번째의 구분기호로 나눈다.

//		System.out.println(str.nextToken());	// 해당토큰을 구해온다 - string으로 지정해야함
//		System.out.println(str.nextToken());	// 반복문으로 해야 끝까지 나온다.
//		System.out.println(str.nextToken());	// 하나하나 추가하면 가져올 토큰이 없을 때에 예외가 일어나며 오류가일어남
		
		
		// 파싱된 문자열이 모두 몇 개인지 되는지 알려줌
		int cnt = str.countTokens();
		System.out.println("파싱할 문자열의 총갯수-> " + cnt);
						//	파싱 : 구분문자
//		System.out.println(str.nextToken());
		while (str.hasMoreTokens()) { 			// 토큰이 있으면	// 토큰 구분한 문자	// 반복문을 사용해서 가져온다.	
			System.out.println(str.nextToken());	// 차례대로 파싱된 문자열을 얻어온다.		// boolean형이며 있면 true가 되어 실행된다.
		}	// 실행되는 대표적인 예

	} // main() end

}