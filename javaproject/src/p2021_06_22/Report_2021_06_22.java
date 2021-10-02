package p2021_06_22;

public class Report_2021_06_22 {

	public static void main(String[] args) {
		   
		
//		String names[] = new String[];// 5명의 학생이름
//
//        String subject[] = new String[] { "국어", "영어", "수학" };



	    int [][]score = { { 85,  60,  70},   
					      { 90,  95,  80},   
					      { 75,  80, 100},   
	                      { 80,  70,  95},   
					      {100,  65,  80}    
						};
	    int [] subject = new int[3];  
	    int [] student = new int[5]; 
	        
	    int  r, c;  
		    
	    System.out.println("각 과목별 총점구하기 ");
	    for(c = 0; c < 3 ; c++){ 	         
	      for(r = 0; r < 5 ; r++){ 	      
	        subject[c] += score[r][c];   
	      }
	    }
	    System.out.println("국어:"+subject[0]);  
	    System.out.println("영어:"+subject[1]);  
	    System.out.println("수학:"+subject[2]);  

	    
	    
	    System.out.println("학생별 총점구하기");
	    for(r = 0; r < 5 ; r++){   	       
	      for(c = 0; c < 3 ; c++){     
	        student[r] += score[r][c];  
	      }
	    }
	    System.out.println("학생1:"+student[0]);
	    System.out.println("학생2:"+student[1]);
	    System.out.println("학생3:"+student[2]);
	    System.out.println("학생4:"+student[3]);
	    System.out.println("학생5:"+student[4]);

	    
	    
	  }
	}    