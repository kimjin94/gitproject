package p2021_06_22;

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	p167 ~ 168
//	배열 복사 : for문으로 배열 복사
		
		int[] oldArray = {10, 20, 30};	// 원본 배열
		int[] newArray = new int[5];	// 새로운 배열
		
		for(int i=0; i<oldArray.length; i+=1) {
			newArray[i] = oldArray[i]; 	//배열 복사 3개를 복사하면 남은 2개의 값은 0 - 이 예제 기준으로
		}
		
		// 복사된 배열 출력
		for(int i : newArray) {
			System.out.print(i+"\t");
		}
		// 1차원 배열의 설명 끝 1차원 배열을 이해야 2차원 배열이 이해하기 쉬움
	}

}
