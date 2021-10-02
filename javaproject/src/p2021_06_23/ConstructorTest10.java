package p2021_06_23;


// this() : 같은 클래스 안에 있는 생성자를 호출하라는 의미로서 사용됨. this. 비해 사용빈도는 낮다.
class MyDate10 {

	private int year;
	private int month;
	private int day;

//	생성자 오버로딩 : 한개의 클래스에 여러개의 생성자를 정으릐 하는것을 생성자 오버로딩이라 한다.	
//	옳바른 생성자 오버로딩 : 매개변수의 자료형 다를 경우 , 매개변수의 갯수가 다를 경우, 순서를 바꿈으로 생성자 오버로딩이라 한다.
	public MyDate10() {	 	// 기본 생성자
		this(2006, 1, 1);	// 생성자 호출
	}

	public MyDate10(int new_year) {
		this(new_year, 1, 1);
	}

	public MyDate10(int new_year, int new_month) {
		this(new_year, new_month, 1);	// 같은 클래스 생성자를 호출
	}

	public MyDate10(int new_year, int new_month, int new_day) {
		year = new_year;
		month = new_month;
		day = new_day;
	}	

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest10 {
	public static void main(String[] args) {
		MyDate10 d = new MyDate10(2007, 7, 19);	//생성자 호출
		
		d.print();
		MyDate10 d2 = new MyDate10(2007, 7);
		d2.print();
		MyDate10 d3 = new MyDate10(2007);
		d3.print();
		MyDate10 d4 = new MyDate10();
		d4.print();
	}
}