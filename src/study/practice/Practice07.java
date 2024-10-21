package study.practice;

import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("년도 입력 : ");
        int year = scanner.nextInt();
        
        //우선순위 4 < 100 <400
        
        if( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
            System.out.println("윤년이다");
        } else {
            System.out.println("윤년이 아니다");
        }
        
        if(year % 400 == 0) {
        	System.out.println("윤년이다");
        }else if(year % 100 == 0) {
        	System.out.println("윤년이 아니다");
        }else if(year % 4 == 0) {
        	System.out.println("윤년이다");
        }else {
        	System.out.println("윤년이 아니다");
        }
        
		//2-1
		for(int i=1;i<=5;i++) {
			System.out.println("12345");
		}
		System.out.println("----------");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("----------");
		
		//2-2
		for(int i=1;i<=5;i++) {
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
			System.out.print(i);
			System.out.println();
		}
		System.out.println("----------");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
