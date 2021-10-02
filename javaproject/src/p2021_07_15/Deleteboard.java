package p2021_07_15;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Deleteboard {

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
			
			System.out.println("삭제할 글번호를 입력하세요.");
			int ino = Integer.parseInt(br.readLine());
			
			String sql = "delete from board where no = ?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, ino);
			
			int result = pstmt.executeUpdate();
			if(result == 1) {
				System.out.println("글 삭제 성공");
			}else {
				System.out.println("글 삭제 성공");
			}
			
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("글 번호를 입력하세요.");
		}finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null)	con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
