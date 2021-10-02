package p2021_06_18;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// break : 반복문을 빠져 나오는 역할		
// 무한루프 : for문을 사용 (많이 사용 않함)
		
		for(int i=1;;i+=1) {	// ;;는 무한출력
			System.out.println(i+"무한출력");
			if(i==100) break; //if 함깨 많이 쓰임 if은 break의 조건 설정역할 
		}
		
		
	}

}
