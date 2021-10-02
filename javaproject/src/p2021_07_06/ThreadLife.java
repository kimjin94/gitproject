package p2021_07_06;

//Thread의 생명 주기(Life Cycle)
//Runnable :  새로 생성한 Thread를 start하면 Runnable 상태가 됨.
//                 실행 가능한 상태( start() 메소드 호출한 상태)
//Running : CPU를 점유하고 run() 메소드 내의 명령문을 실행하는 
//	  상태. 실행상태(run() 메소드를 실행한 상태)
//Block : 특정 메소드의 호출에 의해서 현재 실행중인 Thread가 
//	CPU의 제어권을 잃어버린 상태.
//Dead : run() 메소드의 명령 수행이 끝났을 경우


public class ThreadLife implements Runnable{
    
    public void run() {			// 실행 상태
		for( int i=1 ; i<21 ; i++ ) {
			// thread의 이름과 정수 출력
	  System.out.println( Thread.currentThread().getName() +
										" number = " + i );
		}
    }

    public static void main( String[] args ) {	
		ThreadLife tl = new ThreadLife();

		// 첫 번째 Thread 생성
		Thread first = new Thread( tl, "first1" );	// 우선 순위 값을 동일  우선순위는 변경이 가능하다.
		// 두 번째 Thread 생성
		Thread second = new Thread( tl, "second1" );
		// 세 번째 Thread 생성
		Thread third = new Thread( tl, "third1" );
		
		second.start();		// 실행 가능한 상태 : run()메소드 호출
		first.start();		
		third.start();
    }
}

