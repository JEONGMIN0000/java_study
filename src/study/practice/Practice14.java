package study.practice;

import java.util.Scanner;

public class Practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] menu = {"입력", "수정", "조회", "삭제", "종료"};
		
		int index=0;
		
		while(true) {
			for(int i=0;i<5;i++) {
				System.out.println( (i+1) + ". " + menu[i]);
			}
			
			Scanner scanner = new Scanner(System.in);
		
			System.out.print("메뉴 번호 입력(1-5) : ");
			index = scanner.nextInt();
			
			if(index>=1 && index<=4) {
				System.out.println(menu[index-1] + "메뉴 입니다");
				System.out.println();
			}else if(index==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못입력");
				System.out.println();
			}
		}
		
		
		
	}

}
