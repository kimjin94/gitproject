package p2021_06_29;

public class SplitEX {	// 많이 쓰임

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	String[] split(String regex)
		
		String jumin = "900101-1234567";
		String[] j = jumin.split("-");
		System.out.println("주민번호 앞자리"+j[0]);
		System.out.println("주민번호 뒤자리"+j[1]);
//		for(int i=0; i<j.length; i+=1)
//			System.out.println(j[i]);	기본 for문
		
		
		for(String s: j) {	//확장 for문
			System.out.println(s);
		}
		String tel = "010-1234-5678";
		String[] t = tel.split("-");
		System.out.println("전화번호 앞자리"+t[0]);
		System.out.println("전화번호 중간자리"+t[1]);
		System.out.println("전화번호 뒷자리"+t[2]);
		
		String email = "totor@naver.com";
		String[] e = email.split("@");
		System.out.println("아이디:"+ e[0]);
		System.out.println("도메인:"+ e[1]);
		
		
	}

}
