package p2021_06_24;

class FinalMember {
  final int a=10;				// final + 변수 = 상수
  public void setA(int a){		
    this.a=a;	// this. 을 수정할려고 하나 a는 변수에서 상수로 변경되어 수정불가
  }
}
public class FinalTest01{
  public static void main(String[] args) {
    FinalMember ft= new FinalMember();
	final int a=1000;
    ft.setA(100);
    System.out.println(a);
  }
}                                                    
