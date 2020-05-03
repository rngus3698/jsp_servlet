package test.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import test.model.vo.Member;

import static common.JDBCTemplate.*;

public class InsertDao {

	public int insert(Connection conn, Member m) {
		
//		Properties prop = new Properties();
		PreparedStatement pstmt = null;
		int result = 0;
		
//		String fileName = InsertDao.class.getResource("/sql/test/test-query.properties").getPath();
		System.out.println("dao");
		try {
//			prop.load(new FileReader(fileName));
			
//			String query = prop.getProperty("insert");
			
			String query = "INSERT INTO MEMBER VALUES(?,?,?)";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPassword());
			pstmt.setInt(3, m.getPhone());
			
			result = pstmt.executeUpdate();
		}
//		catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			close(pstmt);
		}
		return result;
	}

}
