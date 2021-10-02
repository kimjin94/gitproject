package p2021_07_14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insertboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement pstmt = null;

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "tiger");

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("작성자명을 입력하세요.");
			String writer = br.readLine();
			System.out.println("비밀번호를 입력하세요.");
			String passwd = br.readLine();
			System.out.println("제목을 입력하세요.");
			String subject = br.readLine();
			System.out.println("내용을 입력하세요.");
			String content = br.readLine();

			String sql = "insert into board "; // 띄어쓰기를 반드시 사용한다.
			sql += "values(board_seq.nextval,?,?,?,?,sysdate )";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, writer);
			pstmt.setString(2, passwd);
			pstmt.setString(3, subject);
			pstmt.setString(4, content);

			int result = pstmt.executeUpdate(); // SQL문 실행
			if (result == 1) {
				System.out.println("글 작성 성공");
			} else {
				System.out.println("글 작성 실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
