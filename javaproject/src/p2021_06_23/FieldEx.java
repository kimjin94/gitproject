package p2021_06_23;

// p202
class FieldInitValue{
	// 필드(field)
	byte byteField;
	short shortField;
	int intField;
	long longField;

	float floatField;
	double doubleField;
	
	char charField;
	boolean booleanField;

	int[] arrField;
	String referenceField;
	
	
	
}


public class FieldEx {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FieldInitValue f = new FieldInitValue();
		
		System.out.println("byteField:"+f.byteField);	// 0으로 초기화
		System.out.println("shortField:"+f.shortField);
		System.out.println("intField:"+f.intField);
		System.out.println("longField:"+f.longField);
		
		System.out.println("floatField:"+f.floatField);	// 0.0으로 초기화
		System.out.println("doubleField:"+f.doubleField);

		System.out.println("charField:"+f.charField);		
		System.out.println("booleanField:"+f.booleanField); // false로 초기화

		System.out.println("arrField:"+f.arrField);// null로 초기화
		System.out.println("referenceField:"+f.referenceField);
		
		
		
	}

}
