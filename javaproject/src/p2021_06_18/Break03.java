package p2021_06_18;

public class Break03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 난수 발생 : 0.0 <= Math.random() < 1.0
		
		int i=1;
		while(true) {	// 무한 루프
			i+=1;
			int num = (int)(Math.random()*45)+ 1; // 난수 발생:1~45
			System.out.println(num);
		
			if (num == 6) break;	// 무한루프를 빠져나옴
		}
		System.out.println("루프횟수:"+(i-1));
		System.out.println("프로그램 종료");
		
		
		
		
		
	}

}
