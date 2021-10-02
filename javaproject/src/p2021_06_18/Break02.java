package p2021_06_18;

public class Break02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// break : 반복문을 빠져 나오는 역할		
// 무한루프 : while문을 대표적으로 많이 사용		
		
		int i=1;
		while(true) {  		  // 조건식에 참인결과도 많이사용함
			System.out.println(i+"무한 출력");
			if(i==100) break; // 아랫쪽에 있는 식은 작동안됨
			i+=1;
		}
		
		
		
		
		
	}

}
