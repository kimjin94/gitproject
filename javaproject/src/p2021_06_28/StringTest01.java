package p2021_06_28;

class StringTest01 {

//	String 객체를 생성한 후에 메소드에 의해서 값의 변화가 일어나면 
//	변경된 값을 힙메모리 영영에 다시 저장한다.

//	Garbage Collection 기능 (쓰레기 수집 기능)	- 자동메모리 관리 기능
//	: 재사용할 수 없는 힙메모리 영역의 데이터를 모아서 지워주는 기능
	
  public static void main(String[] args) {
    String str1 = "Java Programming";
	str1.toUpperCase();              //메서드 호출 후에도 			// 대문자로 변경하는 식
    System.out.println(str1);      	 //str1의 내용은 수정되지 않는다. 
	System.out.println(str1.toUpperCase());	// 메소드의 처리 결과를 str1에 저장후 출력

    String str2=str1.toUpperCase();  //메소드의 처리 결과를  다시 str2에 저장
    System.out.println(str2);          
  }    
}  