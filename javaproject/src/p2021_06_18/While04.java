package p2021_06_18;

public class While04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// while문을 이용해서 구구단(2~9단)을 출력하는 프로그램을 작성하세요.
		
		int dan=2, i;		// 초기값 : 단
		while(dan <=9) {	// 조건식 : 단
			System.out.println("["+dan+"단]");
			 i = 1;			// 초기값 : 곱하는 i의 초기값
			while(i<=9) {	// 조건식 : i
				System.out.println(dan+"*"+i+"="+dan*i);
				i+=1;		// 증감식 : i
			}
			dan+=1;			// 증감식 : 단  
//			i=1;			// 2단이 끝나고 i값을 초기화
			System.out.println();
		}
		
		
		
		
		
		
	}

}
