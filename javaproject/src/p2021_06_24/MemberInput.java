package p2021_06_24;

import java.util.ArrayList;
import java.util.Scanner;

class MemberInfo {
	private static String name;
	private static int age;
	private static String email;
	private static String address;

	public MemberInfo() {

	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	String getEmail() {
		return email;
	}

	String getAddress() {
		return address;
	}

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}

	void setEmail(String email) {
		this.email = email;
	}

	void setAddress(String address) {
		this.address = address;
	}
}

public class MemberInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<MemberInfo> mb = new ArrayList<MemberInfo>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1.회원정보 입력   2. 회원정보 출력  3.종료");
			int input = sc.nextInt();
			if (input == 1) {
				MemberInfo mb1 = new MemberInfo();
				System.out.print("이름:");
				mb1.setName(sc.next());
				System.out.print("나이:");
				mb1.setAge(sc.nextInt());
				System.out.print("이메일:");
				mb1.setEmail(sc.next());
				System.out.print("주소:");
				mb1.setAddress(sc.next());
				mb.add(mb1);
			
			} else if (input == 2) {

				System.out.println("========================================");
				System.out.println("이름\t나이\t이메일\t주소");
				System.out.println("========================================");
				for (MemberInfo m : mb) {
					System.out.print(m.getName() + "\t");
					System.out.print(m.getAge() + "\t");
					System.out.print(m.getEmail() + "\t");
					System.out.print(m.getAddress() + "\t");
					System.out.println();
					System.out.println();
					System.out.println();
				}

			} else if (input == 3) {
				System.out.println("회원정보처리를 종료합니다");
				break;

			} else {
				System.out.println("잘못 입력하셨습니다");
			}

		}

	}
}
