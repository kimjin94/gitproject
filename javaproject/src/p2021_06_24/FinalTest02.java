package p2021_06_24;

class FinalMethod{			// 부모 클래스
  String str="Java ";
  //public void setStr(String s) {
  //final 붙이면 서브 클래스에서 오버라이딩이 불가.            
  public final void setStr(String s) {
    str=s;
    System.out.println(str);
  }
}
class FinalEx extends FinalMethod{    // 자녀 클래스 = 상속받는 것은 필드, 메소드를 받는다. 
  int a=10; // 부모클래스에 final 붙이면 밑에서 a값 대입 불가.
  public void setA(int a) {
    this.a=a;
   }
  public void setStr(String s) {		// 메소드 오버라이딩
    str+=s;
    System.out.println(str);
  }

}
public class FinalTest02{
  public static void main(String[] args) {
    FinalEx  ft= new FinalEx( );
    ft.setA(100);
    ft.setStr("hi");// 슈퍼 클래스의 setStr을 실행.
    FinalMethod ft1=new FinalMethod( );
    ft1.setStr("hi");// 자신의 클래스의 setStr을 실행.
  }   
}           