package p2021_07_08;

import java.io.File;

public class Report2021_07_08 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	
		
		    File temp = new File( "C:/java02", "temp" );		
		    File tempFile = new File( "test1" );					

		   
		    System.out.println( "create directory state : " + temp.mkdirs() );		 
		    System.out.println( "create directory state : " + tempFile.mkdirs() );	 

//		비어있지 않는 디렉토리 삭제 
//		  안에 있는 파일 삭제
//		 test1 디렉토리 삭제
		    
		    if(tempFile.exists()) {
		    		if(tempFile.isDirectory()) {
		    			File[] tempFiles = tempFile.listFiles();
		    			for(int i=0; i<tempFiles.length; i+=1) {
		    			if(tempFiles[i].delete()) {
		    				System.out.println("파일 삭제 완료");
		    			}else {
		    				System.out.println("파일 삭제 실패");
		    			}
		    			}
		    		}
		    		if(tempFile.delete()) {
		    			System.out.println("파일 삭제 완료");
		    		}else {
		    			System.out.println("파일 삭제 실패");
		    		}
		    }
		    temp.delete();
		    temp.getParentFile().delete();
		    
		    System.out.println( "temp canRead : " + temp.canRead() );			
		    System.out.println( "temp canWrite : " + temp.canWrite() );			
		    System.out.println( "temp getAbsoluteFile : " + temp.getAbsoluteFile());
		    System.out.println( "temp getName : " + temp.getName() );
		    System.out.println( "temp getParent : " + temp.getParent() );		 
		    System.out.println( "temp getPath : " + temp.getPath() );
		    System.out.println( "temp isDirectory : " + temp.isDirectory() );	
		    System.out.println( "temp isFile : " + temp.isFile() );				
	
	    }
	

	}


