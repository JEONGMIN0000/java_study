package study.db.sample.v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	
public List<Product> findProductList() {
		
		Connection conn = null; // db 연결
		PreparedStatement psmt = null; 
		ResultSet rs = null;    // sql 실행 select 결과 저장하는 객체

		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		String sqlQuery = "select * from product";
		List<Product> productList = new ArrayList<Product>();
		
		try {
			//쿼리 실행 후 데이터 후속 처리

			psmt = conn.prepareStatement(sqlQuery);
			rs = psmt.executeQuery();

			while(rs.next()) {	//다음 읽어올 데이터가 있는가? true 데이터가 있다
				productList.add(new Product(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}  finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return productList;
	}
}
