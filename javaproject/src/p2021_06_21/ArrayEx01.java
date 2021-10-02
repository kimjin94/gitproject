package p2021_06_21;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	배열 : 동일환 자료형의 데이터를 저장하기 위한 정적인 자료구조.
//	변수 -> 배열 -> 지료구조(List)

//	1차원 배열 첫번째 형식 : 배열에 저장될 값이 정해져 있지 않은 경우에 주로 사용
		int 	score[] = new 	int[3];
//		자료형 	배열변수	   연산자	자료형[배열의 크기(heap의 영역에서 저장됨)]

		// int형 배열은 자동의로 0으로 초기화 된다.
		System.out.println(score[0]); // 0
		System.out.println(score[1]); // 0
		System.out.println(score[2]); // 0

		score[0] = 80; // 0번에 80점을 할당
		score[1] = 90; // 0번에 90점을 할당
		score[2] = 100; // 0번에 100점을 할당

		System.out.println(score[0]); // 80
		System.out.println(score[1]); // 90
		System.out.println(score[2]); // 100

		// double 배열은 자동으로 0.0으로 초기화가 된다.
		double[] d = new double[3];
		System.out.println(d[0]); // 0.0
		System.out.println(d[1]); // 0.0
		System.out.println(d[2]); // 0.0

		// char 배열은 자동으로 초기화가 되지 않는다.
		char[] c = new char[3];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);

		// boolean 배열은 자동으로 false로 초기화가 된다.
		boolean[] b = new boolean[3];
		System.out.println(b[0]); // false
		System.out.println(b[1]); // false
		System.out.println(b[2]); // false

		//
		String[] str = new String[3];
		System.out.println(str[0]); // null
		System.out.println(str[1]); // null
		System.out.println(str[2]); // null

		str[0] = "자바";
		str[1] = "오라클";
		str[2] = "스프링";
		System.out.println(str[0]); // 자바
		System.out.println(str[1]); // 오라클
		System.out.println(str[2]); // 스프링
		
		
//	1차원 배열 두번째 형식 : 배열 선언과 동시에 초기화를 할때 주로 사용
//						(값이 정해져 있는 경우에 주로 사용)
//		Stack영역	 -> heap영역(같은 자료형의 방 값만큼 생성)
		int[] s = {80, 90, 100};	// 10.5(double)을 넣으면 오류 발생함으로 동일한 자료형을 넣어야함
		int[] s1 = new int[]{80, 90, 100};
		System.out.println(s[0]);		// 80
		System.out.println(s[1]);		// 90
		System.out.println(s[2]);		// 100
		System.out.println("배열의 크기:"+ s.length);	// 배열의 크기:3
		for(int i=0; i<s.length; i+=1)	//for문과 함깨 많이 쓰인다.
			System.out.print(s[i]+"\t");
		System.out.println();
		
		double[] dd = {3.14, 10.5, 42.195};
		for(int i=0; i<dd.length; i+=1)
		System.out.print(dd[i]+"\t");
		System.out.println();
		
		char[] cc = {'j', 'a', 'v', 'a', '자', '바'};
		for(int i=0; i<cc.length; i+=1)
		System.out.print(cc[i]+"\t");
		System.out.println();
		
		boolean[] bb = {true, false, true};
		for(int i=0; i<bb.length; i+=1)
			System.out.print(bb[i]+"\t");
			System.out.println();
			String[] str1 = {"자바", "오라클", "스프링", "파이썬", "텐스플로우"};
			String[] str2 = new String[] {"자바", "오라클", "스프링", "파이썬", "텐스플로우"};
			for(int i=0; i<str1.length; i+=1)
				System.out.print(str1[i]+"\t");

	}

}
