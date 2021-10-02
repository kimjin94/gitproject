package p2021_06_23;

class MyDate{   
  private int year;    		// field, 맴버변수
  private int month;    	// private은 자기 클래스에서만 허용한다.
  private int day;

  public  MyDate(){			// 기본 생성자 (Default Constructor)
    System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
  }  
  public void print(){		// 메소드 (method)
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end

public class ConstructorTest02 {     
  public static void main(String[] args) {
//	  ConstructorTest02 c = new ConstructorTest02(); // 의미없는 작업
	//생성자는 객체를 생성할 때 호출된다.
	  MyDate d =  new MyDate();	// 생성자 호출
    d.print();		
//	System.out.println(d.year);	// private은 외부의 클래스 접근은 막아서 오류가 발생한다.
//	MyDate dd =  new MyDate();
 }
} 