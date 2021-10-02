package p2021_06_22;

// p201
class Car{
	//필드(field)
	String company = "현대 자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed =350;
	int speed;						// 따로 설정 하지 않으면 초기값은 0이다.

	public Car() {	// 기본생성자	// 클래스명과 일치
		System.out.println("생성자 호출 성공");
	}
} // 메인 메소드가 없어서 독립시행 않됨



public class CarEX {	//메인 클래스 이름과 파일명이 일치 해야한다. // 메인클래스는 public이 있다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarEX car = new CarEX();	// 자신의 클래스로 객체 생성인 되지만 의미 없는 코드
		Car mycar = new Car();		// heap메모리에 저장 가능한 의미있는 객체
		System.out.println("제작회사:"+mycar.company);
		System.out.println("모델명:"+mycar.model);
		System.out.println("색깔:"+mycar.color);
		System.out.println("최고 속도:"+mycar.maxSpeed);
		System.out.println("현재 속도:"+mycar.speed);		// 0
		
//		필드값 변경
		mycar.speed =60;
		System.out.println("수정된 속도:"+mycar.speed);		// 60
	}

}
