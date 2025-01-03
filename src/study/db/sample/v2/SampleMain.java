package study.db.sample.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SampleMain {

	public static void main(String[] args) {
//		selectDept();

//		findProduct();

//		selectDept2();
//		findDeptByDeptno(40);
//		
//		findDeptByDeptno(20);
		
//		findDeptByDname("RESEARCH");
		
//		findDeptByDname("OPERATIONS");
		
		DeptDAO deptDAO = new DeptDAO();
		
		int r1 = deptDAO.removeDeptByDeptno(81);
		if(r1 > 0) {
			System.out.println("삭제 잘됨");
		}
		
		Dept dd = new Dept(82, null, null);
		int r2 =deptDAO.removeDeptByDeptno(dd);
		if(r1 > 0) {
			System.out.println("삭제 잘됨");
		}
		
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
