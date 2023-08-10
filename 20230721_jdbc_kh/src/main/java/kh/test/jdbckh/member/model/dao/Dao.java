package kh.test.jdbckh.member.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kh.test.jdbckh.member.model.dto.Member;

public class Dao {
public int login(Connection conn, Member vo) {
	System.out.println("[Member Dao login] vo:" + vo);
	int result = 0;
	String query = "select count(*) cnt from member where mid=? and mpwd = ?";
	
			
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, vo.getMid());
		pstmt.setString(2, vo.getMpwd());
		rs = pstmt.executeQuery();
		if(rs.next()) {
			result = rs.getInt("cnt");
		}
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
	close(pstmt);
	}
	System.out.println("[Member Dao login] return:" + result);
	return result;
}
 

private void close(PreparedStatement pstmt) {
	// TODO Auto-generated method stub
	
}


}
