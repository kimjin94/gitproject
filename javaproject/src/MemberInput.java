// 디폴트 package

import java.util.Scanner;

public class MemberInput { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 배열: 객체의 주소를 저장하는 배열
		MemberInfo[] m = new MemberInfo[5]; 
		int i = 0;
		String yn;
		Scanner sc = new Scanner(System.in);
		String name, email, address;
		int age;
		do {
			System.out.print("성명을 입력하세요. ");
			name = sc.nextLine();
			System.out.print("나이를 입력하세요. ");
			age = sc.nextInt();
			sc.nextLine(); 
			System.out.print("E-Mail을 입력하세요. ");
			email = sc.nextLine(); 
			System.out.print("주소를 입력하세요. ");
			address = sc.nextLine();

//			m[i] = new MemberInfo(name, age, email, address);	// 생성자 호출 코드
			m[i] = new MemberInfo();	// 생성자 없이 할때 셋팅 하는 법  핵심
			m[i].setName(name);			// 객체 배열
			m[i].setAge(age);
			m[i].setEmail(email);
			m[i].setAddress(address);
			i+=1;

			System.out.print("계속할려면 y, 멈출려면 n을 입력.");
			yn = sc.nextLine();
			if (yn.equals("y") || yn.equals("Y")) {	// 소문자 나 대문자를 받을때
				continue;
			} else if (yn.equals("n") || yn.equals("N")) {
				break;
			}

		} while (true);

		for (int j = 0; j < i; j++) {
			System.out.println("성명:" + m[j].getName());
			System.out.println("나이:" + m[j].getAge());
			System.out.println("E-Mail:" + m[j].getEmail());
			System.out.println("주소:" + m[j].getAddress());
		}
	}

}

// DTO(Data Transfer object)
class MemberInfo {	// 한번에 입력받고 한번에 출력 시킬때 쓰임
	private String name; 	// 필드, 멤버변수
	private int age;
	private String email;
	private String address;

//	아래의 주석은 생성자 역활은 초기화
//	public MemberInfo(String name, int age, String email, String address) {
//		this.name = name;
//		this.age = age;
//		this.email = email;
//		this.address = address;
//	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public void print() {
		System.out.println(name + ":" + age + ":" + email + ":" + address);
	}
}
