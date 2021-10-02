package p2021_07_06;

//Thread : 1개의 process를 구성하는 작업단위
//Thread : 만드는 방법
//1. Thread 클래스를 상속 받아서 만드는 방범
//2. Runnable 인터페이스를 상속 받아서 만드는 방법

public class RunnableTest implements Runnable {

	// 1부터 20까지 화면에 출력시키는 메소드
	@Override
	public void run() {		// 메소드 오버라이딩
		// TODO Auto-generated method stub
		for (int i = 1; i <= 20; i++) {
			System.out.println("number = " + i);
		}
	}
	

	public static void main(String[] args) {
		// 객체 생성
		RunnableTest tt = new RunnableTest();
		
		// Thread 클래스 객체 생성
		Thread t = new Thread(tt);
		
		// Thread를 시작시킴
		t.start();			// 실행 가능한 상태 : run() 메소드를 호출
		System.out.println("--------> main thread end");
	}

}
