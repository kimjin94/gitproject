package p2021_06_17;

public class If06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 난수 발생 공식
// 난수 = (정수화)	(Math.random()* (상한값 - 하한값+1)) + 하한값;
//									   6             1
		
// (난수)랜덤값 발생
		// 0.0 <= Math.random() < 1.0
// 주사위	번호 : 1		~		6 (자료형변환 사용함)	
		
		
		System.out.println("E="+Math.E);	// e: 자연 로그 상수
		System.out.println("PI="+Math.PI);	// π: 원주율
		System.out.println(Math.random());	// (난수)랜덤값
		
// 주사위 번호 뽑기 : 1 ~ 6
		int num = (int) (Math.random()* 6) + 1;	// 1 ~ 6  로또는 6대신 45
		System.out.println("num="+num);
		
		if(num == 1) {
			System.out.println("1번");
		}else if(num == 2) {
			System.out.println("2번");
		}else if(num == 3) {
			System.out.println("3번");
		}else if(num == 4) {
			System.out.println("4번");
		}else if(num == 5) {
			System.out.println("5번");
		}else {
			System.out.println("6번");
		}
		
		System.out.println("1~45사이의 난수발생");
		int r = (int) (Math.random()* 45) + 1;
		System.out.println("로또번호"+r);
	
	}

}
