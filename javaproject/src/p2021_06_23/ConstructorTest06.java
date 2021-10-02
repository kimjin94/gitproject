package p2021_06_23;

class MyDate06 {
	private int year;			// field, 맴버변수
	private int month;
	private int day;


//  public MyDate06(){			// default 생성자
//  }  							// 생성자는 필드의 값을 초기화 
//	public MyDate06(int new_year, int new_month, int new_day) {
//		year = new_year; 		// 2017
//		month = new_month; 		// 7
//		day = new_day; 			// 19
//	}
	public MyDate06(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

//	public void SetYear(int year) {
//		 this.year=year; 	// 값 전달 해서 수정 할때
//		//year = year;		// 이 식의 year은 수정이 안됨
//	}
//
//	public void SetMonth(int new_month) {
//		month = new_month; // month=8
//	}

	public int getYear() {	// getters method
		return year;		// 자료형 변수에 return으로 값을돌려준다
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public void setYear(int year) {		// setters method
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2017, 7, 19);
		d.print();
		
		d.setYear(2018); // 변경되지 않음
		d.print();
		
		d.setMonth(8); // 변경됨
		d.print();
	
		d.setDay(23); // 변경됨
		d.print();
	}
}