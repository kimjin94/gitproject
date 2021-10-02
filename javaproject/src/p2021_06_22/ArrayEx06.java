package p2021_06_22;

public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	향상된 for문, 획장 for문
//	형식 : for( 변수: 순차적인 자료구조(배열 , 컬랙션) ){
//			실행되는 문장;
//		}

		int[] score = { 95, 71, 84, 93, 87 };

		int sum = 0;
		for (int i = 0; i < score.length; i += 1) {
			sum += score[i];
		}
		System.out.println("총합:" + sum);

		// 확장 for문
		int sum1 = 0;
		for (int s : score) {
			sum1 += s;
		}
		System.out.println("총합:" + sum1);
	}

}
