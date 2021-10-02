package p2021_06_23;

class MyDate05{   
  private int year;    	// field
  private int month;    
  private int day;

//  기본 생성자는 객채를 생성할때 컴파일러가 자동으로 만들어 주지만,
//  예외적으로 매계변수에 생성자가 있을 경우에는 더이상 기본생성자를 
//  만들어 주지 않는다.
  public MyDate05(){	// 기본생성자
  }
  public MyDate05(int new_year, int new_month, int new_day){
    year=new_year;			// d2기준 2017
    month=new_month;		// d2기준 7
    day=new_day;			// d2기준 19
  }  
  public void print(){
    System.out.println(year+ "/" +month+ "/" +day); 
  }
}

public class ConstructorTest05 {     
  public static void main(String[] args) {
    MyDate05 d=new MyDate05();  
    d.print();	// 생성자 호출

    MyDate05 d2=new MyDate05(2017, 7, 19);
    d2.print();
  }
}      