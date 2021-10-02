package p2021_06_29;

class TestClass2 {	// 메소드 오버 로딩 안함 최상위 클래스 자료형으로 변경함
	private Object member;

	public void setValue(Object value) {
		member = value;
	}

	public Object getValue() {
		return member;
	}
}

class GenericTest02 {
	public static void main(String[] args) {
		TestClass2 obj01 = new TestClass2();
		
//		obj01 Value =  new Integer(3);	 업캐스팅+박싱
//		obj01 Value = 3;		    	업캐스팅+자동박싱
		
		obj01.setValue(3);
		System.out.println("되돌리는 값은->" + obj01.getValue());
//		int n = obj01.getValue(); 	오류발생 하위클래스의 자료형을 사용 했기때문에 다운캐스팅 해야함
//		int n = (Integer)(obj01.getValue());  다운캐스팅 최상위 클래스의 자녀 클래스 단위를 만들때
		int n = ((Integer)(obj01.getValue())).intValue(); 			//다운캐스팅 + 박싱
		double d = ((Double)(obj01.getValue())).doubleValue(); 		//(더블)다운캐스팅 + 박싱
		String str = (String)(obj01.getValue()); 					//(String)다운캐스팅 
		
//		objcet value = new double(3.14);	업캐스팅+박싱
//		objcet value = 3.14;				업캐스팅+자동박싱
		
		obj01.setValue(3.4);
		System.out.println("되돌리는 값은->" + obj01.getValue());

		
//		obj01 Value = new String("이해할 수 있다.");		업캐스팅+박싱
		
		obj01.setValue("이해할 수 있다.");
		System.out.println("되돌리는 값은->" + obj01.getValue());

	}
}
