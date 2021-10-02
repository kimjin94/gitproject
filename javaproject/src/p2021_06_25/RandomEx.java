package p2021_06_25;

import java.util.Random; // 직접추가는 가능하나 자동 추가를 추천한다.

public class RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	난수 발생 방법: 1. math.random()
//				2. Random 클래스

//		자동 import : Ctrl + Shift + o
		Random r = new Random();
//		java.util.Random r = new java.util.Random();	
		int n1 = r.nextInt(10); // 0 ~ 9
		System.out.println("n1=" + n1);

//		1 ~ 45 사이의 난수를 발생
		int n2 = r.nextInt(45) + 1; // 45 대입하면 1 ~ 44임으로 +1해야한다.
		System.out.println("n2=" + n2);

//		0.0 <= Math.random() < 1.0으로 난수 발생
		int n3 = (int) (Math.random() * 45) + 1;
		System.out.println("n3=" + n3);

	}

}
