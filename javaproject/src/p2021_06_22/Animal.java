package p2021_06_22;

public class Animal {
//				ㄴ사용자 정의 클래스(자료형)
	int age;		// 멤버 변수, 필드(field), 전역변수(heap 영역에 저장)
					// : 메소드 바깥쪽에 정의 되는 변수
	
	public Animal() {	//	기본생성자( Default Constuctor)
						// : 매개변수가 없는 생성자
	System.out.println("생성자 호출 성공");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10; // 지역 변수 (stack(주소값) 영역에 저장)
		
		String 	str = new 		String("자바");
//		클래스	변수 	= new	heap메모리에 저장되는 참조값
		Animal 			a1 		  = 	new 		Animal(); 
//		클래스의 자료형	  (레프런스)변수		연산자		생성자 호출
//						주소값			변수			int age; 호출
		
//		System.out.println(age);	// 오류발생	// 영역이 어디인지 알 수 없다.
		System.out.println(a1.age);	// 0		// 정상 작동 heap 메모리상에서 0으로 초기값 설정 - 주소값.age	
		a1.age = 5;
		System.out.println(a1.age);	// 5		// 마지막에 할당된 값으로 설정됨

		Animal a2 = new Animal();	// 클래스안에 또다른 공간 그래서 생성자 호출 성공이 다시 나온다.
		System.out.println(a2.age); // 0 		// 다시 0으로 초기화 됨
		
		if(a1 == a2) {	// 주소값을 비교    // 다른 주소로 출력
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
	}

}
