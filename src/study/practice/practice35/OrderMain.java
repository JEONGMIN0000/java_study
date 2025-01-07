package study.practice.practice35;

import org.json.simple.parser.ParseException;

public class OrderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String jsonStr = OrderApiService.orderInfo(); //json포맷 텍스트
		// 가공  parse   분석  (Integer.parseInt  Double.parseDouble)
		
		try {
			CustomerDTO customerDTO = OrderApiService.orderInfo();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// DB 저장?
		OrderDAO orderDAO = new OrderDAO();
		
		// orderDAO 이거저장해라~
	}

}
