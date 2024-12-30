package study.practice.practice29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodTruck {

	// 필드
	String truckName; // 트럭 이름 (매장 이름)
	int totalSales; // 총매출액
	//lossSales
	//income
	boolean isOpened; // 영업 중 여부
	List<Food> foodList; // 판매하는 메뉴 음식 리스트
	
	//일자별 매출이력 관리
	List<SalesInfo> salesInfoList;

	public FoodTruck() {
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
		salesInfoList = new ArrayList<SalesInfo>();
	}

	public FoodTruck(String truckName) {
		this.truckName = truckName;
		totalSales = 0;
		isOpened = false;
		foodList = new ArrayList<Food>();
	}

	public void addMenu(String name, int price) {
		foodList.add(new Food(name, price));
	}

	public void startSales() {
		isOpened = true;
		System.out.println("====[ 푸트드럭 영업시작 ]====");

		while (isOpened) {

			int menu = getMainMenu(); // 메인메뉴 선택

			switch (menu) {
			case 1: // 메뉴보기
				showFoodList(); // 메뉴보여주기
				break;
			case 2: // 주문
				orderMenu();
				break;
			case 3: // 재고관리
				manageStock();
				break;
			case 4: // 마감하기
				finishSales();
				break;
			}

		}
	}

	// printMenuList
	void showFoodList() {
		for (int i = 0; i < foodList.size(); i++) {
			System.out.printf("[%d] %s\n", i + 1, foodList.get(i).getFoodInfo());
		}
	}

	int getMainMenu() {

		Scanner scanner = new Scanner(System.in);
		int menu = 0;

		while (true) {

			System.out.println();
			System.out.println("***[메뉴선택]***");
			System.out.println("1.메뉴보기  2.주문하기  3.재고관리  4.마감하기");
			System.out.print(">>> 입력 : ");

			try {
				menu = scanner.nextInt();
			} catch (Exception e) {
				scanner.nextLine();
				menu = 0;
			}

			if (menu >= 1 && menu <= 4) {
				break;
			} else {
				System.out.println(">>> 보기 중에 선택하세요 (1 ~ 4).");
			}
		}

		return menu;
	}

	void orderMenu() { // 주문하기

		int menuIndex = getFoodMenuIndex();

		Food selectedFood = foodList.get(menuIndex);

		// 조건 : 재고가 없으면 주문 불가 -> 해당 메뉴의 재고를 확인
		if (selectedFood.stock > 0) {
			// 재고가 있으면? 주문 1개 처리
			// 주문완료 정보 출력
			System.out.printf("[주문정보] %s 메뉴 1개 주문완료!\n", selectedFood.name);

			// 재고 -1 개 처리
			// foodList.get(orderMenu-1).stock -= 1;
			selectedFood.modifyStock(-1);

			// 몇개 주문하시겠어요? 주문 수량 입력 :
			// 개수입력 -> 남은 재고와 비교 > 5
			// modifyStock(-5)

			// 매출액 증가
			totalSales += selectedFood.price; // price * 주문개수
		} else {
			System.out.println("[품절] 해당 메뉴는 품절입니다!");
		}
	}

	int getFoodMenuIndex() { // 메뉴의 인덱스 선택

		int orderMenu;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			showFoodList();

			System.out.print(">>>주문 메뉴를 선택하세요 : ");
			try {
				orderMenu = scanner.nextInt();
			} catch (Exception e) {
				scanner.nextLine();
				orderMenu = 0;
			}

			// 3
			if (orderMenu >= 1 && orderMenu <= foodList.size()) {
				break;
			} else {
				System.out.println(">>> 메뉴보기 중에 선택하세요.");
			}
		}

		return (orderMenu - 1); // 해당 메뉴의 index 반환
	}

	void manageStock() { // 재고관리

		int menuIndex = getFoodMenuIndex();
		Scanner scanner = new Scanner(System.in);

		System.out.print(">>>재고 조정 개수를 입력하세요 : ");
		int changeStockCount = scanner.nextInt(); // 잘못입력된 값에 대한 예외처리

		Food selectedFood = foodList.get(menuIndex);

		selectedFood.modifyStock(changeStockCount);
		System.out.println("[재고 적용 완료]");
		System.out.println(selectedFood.getFoodInfo());
	}

	void finishSales() { // 영업 마감

		// 최종 수익계산
		// 정리
		// 정산
		// 마감처리
		SalesInfo si = calculateTotalSales();
		salesInfoList.add(si);

		isOpened = false;
		System.out.println("====[ 푸트드럭 영업마감 ]====");
	}

	//void calculateTotalSales() {
	SalesInfo calculateTotalSales() {
		// 매출 / 원가차감 -> 최종 수익?
		int lossSales = 0;
		for (Food food : foodList) {
			lossSales += (int) (food.price * 0.3) * food.stock;
		}

		System.out.println("[마감 정보]");
		System.out.println(">총 매출 : " + totalSales);
		System.out.println(">폐기손해 : " + lossSales);
		System.out.println(">최종수익 : " + (totalSales - lossSales));
		
		SalesInfo si = new SalesInfo();
		si.totalSales = totalSales;
		si.lossSales = lossSales;
		si.income = totalSales - lossSales;
		
		//salesInfoList.add(si);
		return si;
	}

}
