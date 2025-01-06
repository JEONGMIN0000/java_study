package study.db.sample.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.sample.v2.ProfessorDTO;

public class ProfessorDAO {
	
	Connection conn = null; // db 연결
	PreparedStatement psmt = null; // 연결하여 sql 명령을 실행해주는 객체
	ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체
	
	public List<ProfessorDTO> findProfessorListByDeptno(int deptno) {

		conn = DBConnectionManager.connectDB();

		List<ProfessorDTO> professorList = new ArrayList<ProfessorDTO>();

		// 쿼리 준비
		//String sqlQuery = "select * from professor where deptno = ?";
		String sqlQuery = "select profno, name, id, position, pay, deptno, "
				+ " TO_CHAR(hiredate, 'YYYY-MM-DD') hiredate "
				+ " from professor where deptno = ? " ;
		
		try {
			// 쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);

			psmt.setInt(1, deptno);

			rs = psmt.executeQuery();

			while (rs.next()) { // 다음 읽어올 데이터가 있는가? true 데이터가 있다

				ProfessorDTO p = new ProfessorDTO();

				// profno, name, id, position, pay, deptno
				p.setProfno(rs.getInt("profno"));
				p.setName(rs.getString("name"));
				p.setId(rs.getString("id"));
				p.setPosition(rs.getString("position"));
				p.setPay(rs.getInt("pay"));
				p.setDeptno(rs.getInt("deptno"));
				
				//java.sql.Date -> java.time.LocalDateTime
				//p.setHiredate(rs.getDate("hiredate").toLocalDate()); //localDate 타입일 때
				
				//DB (Date, TimeStamp) -> s.getTimeStamp
				//p.setHiredate(ConvertDateUtil.convertTimestampToLocalDateTime(rs.getTimestamp("hiredate")));
				
				//timestamp -> LocalDateTime
				
				p.setHiredate(rs.getString("hiredate"));
				
				professorList.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		return professorList;

	}

}
