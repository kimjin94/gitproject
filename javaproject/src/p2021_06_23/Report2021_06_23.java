package p2021_06_23;

public class Report2021_06_23 {		// C언어의 구조체에서 c++, java로 넘어오면서 클래스와 같은 것

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l[] = new int[6];	// 순차적인 자료구조	// 변수를 확장시킨 개념이 배열

		for (int i = 0; i < l.length; i += 1) {
			l[i] = (int) (Math.random() * 45) + 1; // 1 ~ 45의 난수 값 발생
//			num[0]=5; num[1]=5; 
			for (int j = 0; j < i; j += 1) {	// 중복 검사
				if (l[i] == l[j]) {
					i -= 1;	// i를 감소 시키셔 break로 중복for문을 나와서 새로 난수를 얻는다.
					break;
				}// if end if문은 retrun으로 빠져나옴
			}// for end for반복문은 break로 빠져나옴
		}// for end
		System.out.print("무작위 수 6개:");

		for (int i = 0; i < l.length; i += 1) {		// int l[] = new int[6] = l.length = 6 
			System.out.print(l[i] + " ");
		}
	}

}
