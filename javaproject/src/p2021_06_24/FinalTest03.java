package p2021_06_24;

// 상속을 허용하지 않음
final class FinalClass{		// 부모 클래스
  String str="Java ";
    public void setStr(String s){
      str=s;
    System.out.println(str);
  }
}
// 자녀 클래스
class FinalEx extends FinalClass{    // 자녀 클래스에 final을 붙은 상태에서 상속을 시도하려고해서 오류가 일어남
   int a=10; 
   public void setA(int a)  {
    this.a=a;
   }
   public void setStr(String s){
    str+=s;
    System.out.println(str);
   }
}
public class FinalTest03{
   public static void main(String[] args) {
    FinalEx fe= new FinalEx( );
   }   
}          