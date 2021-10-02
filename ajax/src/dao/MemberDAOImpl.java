package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class MemberDAOImpl {
	
	Connection con=null;
	PreparedStatement pstmt=null;
	Statement stmt=null;
	ResultSet rs=null;
	DataSource ds=null;
	String sql=null; 		

	public int checkMemberId(String id){
		int re=-1;		// 사용 가능한 ID
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
		sql="select join_code from join_member where join_id=?";
		
		try{
			
			Class.forName(driver); //JDBC Driver Loading
			con = DriverManager.getConnection(url, "scott", "tiger");
			
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,id);			
			rs=pstmt.executeQuery();
			
			if(rs.next()){	// 중복 ID
				re=1;	 	
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return re;
	}
	
}



