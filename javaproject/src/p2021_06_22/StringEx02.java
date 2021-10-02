package p2021_06_22;

public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	p167
//	객채 배열 : 객채의 주소를 참조하는 (저장하는) 배열
		
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);		//true	주소 비교
		System.out.println(strArray[0] == strArray[2]);		//false 주소 비교
		System.out.println(strArray[0].equals(strArray[2]));//true	참조값 비교
		
	}

}
