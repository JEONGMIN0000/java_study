package study.practice.practice36;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.practice.practice36.DBConnectionManager;



public class StudentDAO {
	
	Connection conn = null; // db 연결
	PreparedStatement psmt = null; // 연결하여 sql 명령을 실행해주는 객체
	ResultSet rs = null; // sql 실행 select 결과 저장하는 객체  
	
	//전체조회
	public List<StudentDTO> findStudentList() {
		
		conn = DBConnectionManager.connectDB();

		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		
		//쿼리 준비
		String sqlQuery = "select * from student";
//		String sqlQuery = "select studno, name, id, grade, jumin, TO_CHAR(birthday, 'yyyyMMdd') birthday, " +
//				" tel, height, weight, deptno1, deptno2, profno " +
//				" from student";
		
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다
								
				StudentDTO student = new StudentDTO();
				
				student.setStudno(rs.getInt("studno")); 
				student.setName(rs.getString ("name"));
				student.setId(rs.getString ("id"));
				student.setGrade(rs.getInt("grade"));
				student.setJumin(rs.getString("jumin"));
				student.setBirthday(rs.getString ("birthday"));
				//birthday가 LocalDateTime 이면
				//student.setBirthday(ConvertDateUtil.convertTimestampToLocalDateTime( rs.getString ("birthday") ));
				student.setTel(rs.getString ("tel"));
				student.setHeight(rs.getInt("height"));
				student.setWeight(rs.getInt("weight"));
				student.setDeptno1(rs.getInt("deptno1"));
				student.setDeptno2(rs.getInt("deptno2"));
				student.setProfno(rs.getInt("profno"));
			
				studentList.add(student);

				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return studentList;
	}


	//학년별 조회
	public List<StudentDTO> findStudentListByGrade(int grade) {
		
		conn = DBConnectionManager.connectDB();


		List<StudentDTO> studentList = new ArrayList<StudentDTO>();
		
		//쿼리 준비  
		String sqlQuery = "select * from student where grade = ? ";
//		String sqlQuery = "select studno, name, id, grade, jumin, TO_CHAR(birthday, 'yyyyMMdd') birthday, " +
//		" tel, height, weight, deptno1, deptno2, profno " +
//		" from student";
		
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			
			//파라미터 셋팅
			psmt.setInt(1, grade);
			
			rs = psmt.executeQuery();
			
			while(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다
				
				StudentDTO student = new StudentDTO();
				
				student.setStudno(rs.getInt("studno")); 
				student.setName(rs.getString ("name"));
				student.setId(rs.getString ("id"));
				student.setGrade(rs.getInt("grade"));
				student.setJumin(rs.getString("jumin"));
				student.setBirthday(rs.getString ("birthday"));
				//birthday가 LocalDateTime 이면
				//student.setBirthday(ConvertDateUtil.convertTimestampToLocalDateTime( rs.getString ("birthday") ));
				student.setTel(rs.getString ("tel"));
				student.setHeight(rs.getInt("height"));
				student.setWeight(rs.getInt("weight"));
				student.setDeptno1(rs.getInt("deptno1"));
				student.setDeptno2(rs.getInt("deptno2"));
				student.setProfno(rs.getInt("profno"));
				
				studentList.add(student);
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return studentList;
	}
	
	
}
