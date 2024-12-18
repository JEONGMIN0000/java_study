package study.practice.practice20;

public class ChineseRestaurant {
	
	public static void main(String[] args) {
		// 주문을 위한 메뉴 선정
		Menu jjajang = new Menu("짜장", 4900);
		Menu jjambbong = new Menu("짬뽕", 5900);
		Menu tangsook = new Menu("탕수육", 13900);
	
		// 메뉴를 조합하여 주문을 생성
		Menu[] menuArr = { jjajang, jjambbong, tangsook };
		
		Order order = new Order(123, menuArr);
		
		
		Menu[] menu2 = { new Menu("짜장", 4900), new Menu("짜장", 4900) };
		Order order2 = new Order(124, menu2);
		

		// 주문 결과 출력
		System.out.printf("주문 합계: %d원\n", order.totalPrice());
		
		System.out.printf("주문 합계: %d원\n", order2.totalPrice());
		
	
		Menu[] menu3 = { new Menu("짜장", 4900), new Menu("짜장", 4900), new Menu("짬뽕", 5900),new Menu("짬뽕", 5900), new Menu("짬뽕", 5900), new Menu("탕수육", 13900), new Menu("탕수육", 13900)};
		Order order3 = new Order(125, menu3);

		System.out.printf("주문 합계: %d원\n", order3.totalPrice());
		
	}
}

class Order {
	// 필드(인스턴스 필드)
	int orderNum;
	Menu[] menus;		//2개 3개 1개 10개

	// 생성자
	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}

	// 메소드(인스턴스 메소드)
	public int totalPrice() {
		/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
		
		//주문메뉴 목록 -> Menu[] menus;
		//가격은 어디에?  menus 안에 Menu 객체 안에 price 변수
		int total = 0;
		for(int i=0; i<menus.length; i++) {
			total += menus[i].price;
		}
		
		return total;
	}
}

class Menu {
	// 필드
	String name;
	int price;

	// 생성자
	public Menu(String str, int i) {
		name = str;
		price = i;
	}
}