package p2021_06_23;

class MyDate04{   
  int year;    		// field, 멤버변수
  int month;    
  int day;  

  public MyDate04(){	// 기본 생성자
    year=2016;    
    month=4;    
    day=1;
  }
  public MyDate04(int year, int month, int day) {
	this.year = year;
	this.month = month;
	this.day = day;
}
public void print(){
	  System.out.println(year+ "/" +month+ "/" +day); 
  }
 
//  this. : 내부 레퍼런스 변수
//  public MyDate04(int year,int month,int day){
//   this.year=year;		// d2 2017
//   this.month=month;	// d2 7
//   this.day=day;		// d2 19
//  }	// 파랑색 멤버 변수  갈색 매개변수
  
  
  


}// MyDate end

public class ConstructorTest04 {     
  public static void main(String[] args) {
    MyDate04 d=new MyDate04();	// 생성자 호출
    d.print();	

    MyDate04 d2=new MyDate04(2017, 7, 19);
    d2.print();
  }
}            