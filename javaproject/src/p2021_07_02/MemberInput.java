package p2021_07_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MemberInfo> li = new ArrayList<MemberInfo>();
//		MemberInfo mm;
		String yn;

		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("성명을 입력하세요? ");
			String name = sc.nextLine();
			System.out.print("나이를 입력하세요? ");
			int age = sc.nextInt();
			System.out.print("E-Mail을 입력하세요? ");
			String email = sc.nextLine();
			System.out.print("주소를 입력하세요? ");
			String address = sc.nextLine();

			MemberInfo m = new MemberInfo();
			// m.name="홍길동";	//직접접근은 불가능하다
			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

//			boolean add(object e)
			li.add(m);		// object e = new MemberInfo();업캐스팅

			System.out.println("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.next();
			if (yn.equals("y")) {
				continue;
			} else if (yn.equals("n")) {
				break;
			}

		} while (true);
//		object get(int index)
		for (int i = 0; i < li.size(); i++) {
			MemberInfo mm = li.get(i);	// 다운 캐스팅 = MemberInfo mm // (MemberInfo) 생략가능
//			object를 상속받은 클래스와 object인 li.get과 상속관계여서 러퍼런스 형변화이 일어난다.
			System.out.println("성명:" + mm.getName());
			System.out.println("나이:" + mm.getAge());
			System.out.println("E-Mail:" + mm.getEmail());
			System.out.println("주소:" + mm.getAddress());
		}
	}

}
// DTO(Data Transfer object)
class MemberInfo extends Object{	// 자동지정
	private String name;
	private int age;
	private String email;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
