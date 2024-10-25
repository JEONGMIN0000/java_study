package study.practice;

import java.util.Scanner;

public class Practice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String[] menu = {"아메리카노", "카페라떼", "바닐라라떼"};
		
		int[] price = {3500, 4100, 4300};
		
		int[] count= {0, 0, 0};
		
		String order = "y";
		
		int total = 0;
		
		while(order.equals("y")) {
			
			System.out.println("===== 메뉴 =====");
			for(int i=0;i<menu.length;i++) {
				System.out.printf("%d. %2s %3d \n",(i+1),menu[i],price[i]);
			}
			System.out.println("==============");
			System.out.print("메뉴선택 : ");
			int menuNum = scanner.nextInt();
			if(menuNum!=1||menuNum!=2||menuNum!=3) {
				System.out.println("잘못입력");
				System.out.print("메뉴선택 : ");
				menuNum = scanner.nextInt();
			}
				System.out.print("수량선택 : ");
				int countNum = scanner.nextInt();
				scanner.nextLine();
				System.out.print("추가주문? (y/n):");
				order = scanner.nextLine();
				
				if(!order.equals("y")||!order.equals("n")) {
					System.out.println("잘못입력");
					System.out.print("추가주문? (y/n):");
					order = scanner.nextLine();
				}
				
				if(menuNum==1) {
					count[0]+=countNum;
				}else if(menuNum==2) {
					count[1]+=countNum;
				}if(menuNum==3) {
					count[2]+=countNum;
				}
				
				if(order.equals("n")) {
					break;
				}
		}
		
		System.out.println("==============");
		for(int i=0;i<menu.length;i++) {
			if(count[i]>0) {
				System.out.printf("%s %2d잔 : %3d원 \n" ,menu[i],count[i],price[i]*count[i]);
			}
			total+=price[i]*count[i];
		}
		System.out.println("==============");

		System.out.printf("총액 : %d 원",total);
		
		
	}

}
