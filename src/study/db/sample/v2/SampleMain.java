package study.db.sample.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SampleMain {

	public static void main(String[] args) {
		
		DeptDAO deptDAO = new DeptDAO();
		
		/*
		//삭제
		int r1 = deptDAO.removeDeptByDeptno(81);
		if(r1 > 0) {
			System.out.println("삭제 잘됨");
		}
		
		Dept dd = new Dept(82, null, null);
		int r2 =deptDAO.removeDeptByDeptno(dd);
		if(r1 > 0) {
			System.out.println("삭제 잘됨");
		}
		*/
		
		/*
		//수정
		Dept changeDept = new Dept(83, "재무팀", "부산");
		//changeDept.setLoc("울산");
		
//		Dept changeDept2 = new Dept();
//		changeDept2.setDeptno(83); //deptno 83인 값을 찾아서
//		changeDept2.setDname("재무팀"); //dname 안바꿀거면 기존값
//		changeDept2.setLoc("수원"); //loc를 수원으로 바꾸겠다
		
		int r3 = deptDAO.modifyDept(changeDept);
		if(r3 > 0) {
			System.out.println("수정 잘 됐다");
		}
		*/
		
		/*
		//저장
		List<Dept> saveList = new ArrayList<Dept>();
		saveList.add(new Dept(81, "이름1", "지역1"));
		saveList.add(new Dept(82, "이름2", "지역2"));
		saveList.add(new Dept(83, "이름3", "지역3"));
		
		int count = 0;
		for(Dept d : saveList) {
			int result = deptDAO.saveDept(d);
			count+=result;
			if(result > 0) {
				System.out.println("저장 잘됨");
			}
		}
		System.out.println("총" + count + "개 저장됨");
		*/
		
		/*
		//저장
		Dept newD = new Dept();
		newD.setDeptno(90);
		newD.setDname("개발팀");
		newD.setLoc("서울");
		
		int result = deptDAO.saveDept(newD);
		if(result > 0) {
			System.out.println("데이터 저장 성공");
		}
		*/
		/*
		Dept d1 = deptDAO.findDeptByDeptno(30);
		if(d1 != null) {
			System.out.println(d1.getDeptno() + " " + d1.getDname() + " " + d1.getLoc());
		}
		
		List<Dept> dList = deptDAO.findDeptList();
		//if(dList == null)
		
		if(dList.size() == 0 ) {
			
		}
		
		if(dList != null && dList.size() > 0 ) {  //Data 있다
			
			for(Dept d : dList) {
				System.out.println(d.getDeptno() + " " + d.getDname() + " " + d.getLoc());
			}
			
		}
		
		ProductDAO productDAO = new ProductDAO();
		List<Product> productList = productDAO.findProductList();
		
		for(Product p : productList) {
			System.out.println(p.toString());
		}
		*/
		
		ProfessorDAO professorDAO = new ProfessorDAO();
		
		List<ProfessorDTO> pList= professorDAO.findProfessorListByDeptno(101);
		
		ProfessorDTO p = pList.get(0);
		
		System.out.println(p.getHiredate());
		
		//System.out.println(ConvertDateUtil.convertlocalDateTimeToString(p.getHiredate()));
		
		//System.out.println(p.getHiredate().getMonth());
		//System.out.println(p.getHiredate().getYear());
		//1980 - 06 - 23
		
		
		LocalDateTime ldt = LocalDateTime.now();
		
		System.out.println(ldt);
		System.out.println(ldt.getYear());
		System.out.println(ldt.getMonth()); //JANUARY
		System.out.println(ldt.getMonthValue()); //1
		
		
	}
	
	

	public static void findProduct() {
		
		Connection conn = null; // db 연결
		//Statement stmt = null;  // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null; 
		ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		String sqlQuery = "select * from product";
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다
				System.out.println(rs.getInt("p_code"));
				System.out.println(rs.getString("p_name"));
				System.out.println(rs.getInt("p_price"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
	}

	//		       readDept   findDept    findDeptList
	public static void selectDept() {
		
		Connection conn = null; // db 연결
		//Statement stmt = null;  // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null; 
		ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();


		//쿼리 준비
		String sqlQuery = "select * from dept";
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다
				//				System.out.println(rs.getInt(1));
				//				System.out.println(rs.getString(2));
				//				System.out.println(rs.getString(3));


				System.out.println(rs.getString("dname"));
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}

		
	}
	
	
	public static void selectDept2() {
		
		Connection conn = null; // db 연결
		//Statement stmt = null;  // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null; 
		ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();


		//쿼리 준비
		String sqlQuery = "select * from dept where deptno = 30";
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			if(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
	}
	
	
	
	
	public static void findDeptByDname(String dname) {
		
		Connection conn = null; // db 연결
		//Statement stmt = null;  // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null; 
		ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();


		//쿼리 준비  
		String sqlQuery = "select * from dept where dname = ? ";
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			
			//파라미터 셋팅
			psmt.setString(1, dname);
			
			rs = psmt.executeQuery();

			if(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
	}

}
