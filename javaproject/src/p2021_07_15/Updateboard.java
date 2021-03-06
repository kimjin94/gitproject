package p2021_07_15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Updateboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement pstmt = null;
		
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost/jsptest";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "jspid", "jsppass");
			
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));
			System.out.print("수정할 글 번호를 입력하세요.");
			String no = br.readLine();
			int ino = Integer.parseInt(no);
			System.out.print("작성자명을  입력하세요.");
			String writer = br.readLine();
			System.out.print("비밀번호를  입력하세요.");
			String passwd = br.readLine();
			System.out.print("제목을  입력하세요.");
			String subject = br.readLine();
			System.out.print("내용을  입력하세요.");
			String content = br.readLine();
			
			String sql = "update board set writer=?,passwd=?,subject=?,";
				   sql += "content=?, reg_date=sysdate() where no=?";
				   
				   pstmt = con.prepareStatement(sql);
				   pstmt.setString(1, writer);
				   pstmt.setString(2, passwd);
				   pstmt.setString(3, subject);
				   pstmt.setString(4, content);
				   pstmt.setInt(5, ino);
				   
				   int result = pstmt.executeUpdate();
				   if(result == 1) {
					   System.out.println("글 수정 성공");
				   }else {
					   System.out.println("글 수정 실패");
				   }
				   
		}catch (Exception e) {
		 e.printStackTrace();
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) pstmt.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	}

}
