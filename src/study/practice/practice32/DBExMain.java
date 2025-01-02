package study.practice.practice32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.sample.v1.Dept;

public class DBExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProductDTO pd = findProductByPCode(104);
		if(pd != null) {
			System.out.printf("%d %s %d\n", pd.getpCode(), pd.getpName(), pd.getpPrice());
		}
		
		List<ProductDTO> list = findProductList();
		if(list.size() > 0) {
			
			for(ProductDTO product : list) {
				System.out.printf("%d %s %d\n", product.getpCode(), product.getpName(), product.getpPrice());
			}
		}
		
	}
	
	public static ProductDTO findProductByPCode(int pCode) { //단일 조회
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		PreparedStatement psmt = null; 
		ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체

		//DB 연결 
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		ProductDTO pd = null;
		
		//쿼리 준비  
		String sqlQuery = "select * from product where p_code = ? ";
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			
			//파라미터 셋팅
			psmt.setInt(1, pCode);
			
			rs = psmt.executeQuery();
			
			if(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다
				pd = new ProductDTO();
				
				pd.setpCode( rs.getInt("p_code") );
				pd.setpName(rs.getString("p_name"));
				pd.setpPrice(rs.getInt("p_price"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		//DB 연결 종료
		try {
			if(rs != null) {
				rs.close();
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return pd;
	}
	
	public static List<ProductDTO> findProductList() { //복수(리스트) 조회
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl"; 
		String db_id = "scott";
		String db_pw = "tiger";

		Connection conn = null; // db 연결
		//Statement stmt = null;  // 연결하여 sql 명령을 실행해주는 객체
		PreparedStatement psmt = null; 
		ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체

		//DB 연결 
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<ProductDTO> productList = new ArrayList<ProductDTO>();
		
		//쿼리 준비
		String sqlQuery = "select * from product";
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다
				ProductDTO pd = new ProductDTO(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));
				productList.add(pd);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		//DB 연결 종료
		try {
			if(rs != null) {
				rs.close();
			}
			if(psmt != null) {
				psmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return productList;
	}	

}
