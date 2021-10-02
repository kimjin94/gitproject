package p2021_06_24;

class Singleton{
	
	// 싱글톤(Singleton) : 객체 생성을 1번만 수행
	private static Singleton s = new Singleton(); // 싱글톤 예시 // 정적 필드
	
	public static Singleton getInstance() {					 // 정적 메소드
		return s;
	}
	
	public void check() {
		System.out.println("메소드 호출 성공1");
	}
	public void check1() {
		System.out.println("메소드 호출 성공2");
	}
}

public class SingletonEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Singleton.s); 접근 불가 -정적 메소드로 이용해서 접근 하는 방법을 많이 사용한다.
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1);			// p2021_06_24.Singleton@15db9742 // obj1과obj2의  주소값은 같다. - 한번만 호출 할 수 있다.
		System.out.println(obj2);			//    객체의 주소			// 객체의 주소값
		
		if(obj1 == obj2) { // 주소값비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		obj1.check();
		obj1.check1();
		obj2.check();
		obj2.check1();
		
	}

}
