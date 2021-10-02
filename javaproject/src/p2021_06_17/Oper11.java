package p2021_06_17;

public class Oper11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 증강 연산자 : ++, --
		
		int a=10, b=10;
		
		System.out.println("a="+a++);		// 후행연산  a=10  선출력 증가후 저장된 값 출력
		System.out.println("a="+a);			//		  a=11
		
		System.out.println("b="+(++b));		// 선행연산  b=11  증가된 값 출력  증가후 저장 된 값 출력
		System.out.println("b="+b);			//        b=11
		
	}

}
