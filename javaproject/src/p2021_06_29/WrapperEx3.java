package p2021_06_29;

// p530
// 자동박싱과 자동 언박싱
public class WrapperEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		자동박싱
		Integer obj = 100;	//	자동박싱
		System.out.println("언박싱:"+ obj.intValue());
		System.out.println("자동언박싱:"+ obj);
		
//		자동 언박싱
		int value = obj;
		System.out.println("value:"+value);
		
//		자동 언박싱
		int result = obj + 100;
		System.out.println("result:"+ result);
	}

}
