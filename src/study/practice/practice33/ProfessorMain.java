package study.practice.practice33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.practice.practice33.ProfessorDTO;

public class ProfessorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ProfessorDTO> list = findProfessorListByDeptno(103);

		for (ProfessorDTO p : list) {
			System.out.println(p.toString());
		}
	}

	public static List<ProfessorDTO> findProfessorListByDeptno(int deptno) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		// Statement stmt = null; // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null;
		ResultSet rs = null; // sql 실행 select 결과 저장하는 객체

		// DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<ProfessorDTO> professorList = new ArrayList<ProfessorDTO>();

		// 쿼리 준비
		String sqlQuery = "select * from professor where deptno = ?";
//			String sqlQuery = "select profno, name, id, position, pay, deptno from professor where deptno = ?";
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

				professorList.add(p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		// DB 연결 종료
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return professorList;

	}

}
