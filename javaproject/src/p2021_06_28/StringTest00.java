package p2021_06_28;

class StringTest00 {
  public static void main(String[] args) {
    String str1 = new String("Java Programming");	// new 연산자 사용 자주 쓰임
    String str2 = new String("Java Programming");	

    if(str1==str2){		// 주소비교 비교연산자를 사용
      System.out.println("같다");
    }else{
     System.out.println("다르다");
	}
    String str3 = "Java Programming";	// new 연산자 미사용
    String str4 = "Java Programming";

    if(str3==str4){			// 주소비교 비교연산자를 사용
        System.out.println("같다");
    }else{
       if (str1== str3) {
    	   System.out.println("같다");
       }else {
    	   System.out.println("다르다");
    	   }
	}
    System.out.println(str1.equals(str3)); //값을 비교
  }    
}          