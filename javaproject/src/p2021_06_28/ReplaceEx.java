package p2021_06_28;

public class ReplaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	p506
//	replace("자바", "JAVA") : 자바를 JAVA로 치환해주는 역활
	
		String oldstr = "자바는 객체지향 언어 입니다.";
		
		String newstr = oldstr.replace("자바", "JAVA");
		System.out.println(oldstr);
		System.out.println(newstr);
		
	}

}
