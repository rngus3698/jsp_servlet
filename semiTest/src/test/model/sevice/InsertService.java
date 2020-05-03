package test.model.sevice;

import static common.JDBCTemplate.*;

import java.sql.Connection;

import test.model.dao.InsertDao;
import test.model.vo.Member;
public class InsertService {

	public int insert(Member m) {
		
		System.out.println("service");
		Connection conn = getConnection();
		InsertDao iDao = new InsertDao();
		
		int result = iDao.insert(conn, m);
		
		if(result > 0)
		{
			commit(conn);
		}
		else
		{
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}

	
}
