package study.practice.practice35;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class OrderApiService {
	
	//외부에 누구 고객의 주문정보 조회
	
		//오늘날짜 주문정보 조회
		
		public static CustomerDTO orderInfo() throws ParseException {
			
			//어딘가 주소 지정
			//요청 변수 지정 (+인증키 지정)
			//요청
			//응답 받은 데이터
			String s = "{"
					+ "\"id\": 1,"
					+ "\"name\": \"John Doe\","
					+ "\"contacts\": ["
					+ "{"
					+ "\"type\": \"email\","
					+ "\"value\": \"john.doe@example.com\""
					+ "},"
					+ "{"
					+ "\"type\": \"phone\","
					+ "\"value\": \"01023456789\""
					+ "}"
					+ "],"
					+ "\"address\": {"
					+ "\"street\": \"123 Main Street\","
					+ "\"city\": \"Seoul\","
					+ "\"zipcode\": \"12345\""
					+ "},"
					+ "\"orders\": ["
					+ "{"
					+ "\"orderId\": \"ORD-001\","
					+ "\"date\": \"2024-07-09\","
					+ "\"items\": ["
					+ "{"
					+ "\"id\": 1,"
					+ "\"name\": \"Smartphone\","
					+ "\"quantity\": 2"
					+ "},"
					+ "{"
					+ "\"id\": 2,"
					+ "\"name\": \"Laptop\","
					+ "\"quantity\": 1"
					+ "}"
					+ "]"
					+ "},"
					+ "{"
					+ "\"orderId\": \"ORD-002\","
					+ "\"date\": \"2024-07-10\","
					+ "\"items\": ["
					+ "{"
					+ "\"id\": 3,"
					+ "\"name\": \"Headphones\","
					+ "\"quantity\": 1"
					+ "}"
					+ "]"
					+ "}"
					+ "]"
					+ "}";
			
			CustomerDTO customerDTO = new CustomerDTO();
			
			//json 포맷 -> 파싱 -> customerDTO 내부 변수 잘 매핑
		
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObj = (JSONObject) jsonParser.parse(s);
			System.out.println("id : " + jsonObj.get("id"));
			System.out.println("name : " + jsonObj.get("name"));

			JSONArray contacts = (JSONArray) jsonObj.get("contacts");
			System.out.println("contacts : ");
			for (int i = 0; i < contacts.size(); i++) {
				JSONObject contact = (JSONObject) contacts.get(i);
				for (int j = 0; j < contact.size(); j++) {
					System.out.println(" type : " + contact.get("type"));
					System.out.println(" value : " + contact.get("value"));
				}
			}

			JSONObject address = (JSONObject) jsonObj.get("address");
			System.out.println("street : " + address.get("street"));
			System.out.println("city : " + address.get("city"));
			System.out.println("zipcode : " + address.get("zipcode"));

			JSONArray orders = (JSONArray) jsonObj.get("orders");
			System.out.println("orders : ");
			for (int i = 0; i < orders.size(); i++) {
				JSONObject order = (JSONObject) orders.get(i);
				System.out.println(" orderId : " + order.get("orderId"));
				System.out.println(" date : " + order.get("date"));
				JSONArray items = (JSONArray) order.get("items");
				System.out.println(" items : ");
				for (int j = 0; j < items.size(); j++) {
					JSONObject item = (JSONObject) items.get(j);
					System.out.println("  id : " + item.get("id"));
					System.out.println("  name : " + item.get("name"));
					System.out.println("  quantity : " + item.get("quantity"));
				}
			}
			
			
			System.out.println();

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customerDTO;
	}

}
