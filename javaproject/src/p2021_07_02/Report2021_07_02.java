package p2021_07_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Report2021_07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set lottoSet = new HashSet();
		
		int num;
		
		while (lottoSet.size() !=6) {
			
			num = (int)(Math.random()*45 + 1);
			
			lottoSet.add(num);
		}
		
		ArrayList<Integer> lottorArr = new ArrayList<Integer>(lottoSet); 
		Collections.sort(lottorArr);
		System.out.println("무작위 6개 번호 ");
	
		for(Object list : lottorArr)
			System.out.print(list+"\t");
		
	}

}
