package p2021_06_29;

// p512


public class SplitEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	String[] split(String regex)
	
		String text="홍길동&이수홍,박연수,김자바-최명호";
		
		String[] names = text.split("&|,|-");
		for(int i=0; i<names.length; i+=1) {
			System.out.println(names[i]);
		}
		System.out.println();
		
//		항상된 for문 순차적인 자료구조
		for(String name : names) {
			System.out.println(name);
		}
	}

}
