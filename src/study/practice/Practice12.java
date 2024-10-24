package study.practice;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		//1 
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				if((2*i)+(4*j)==10) {
					System.out.println("X : " + i +", y : " + j);
				}
			}
		}
		
		
		//2
		System.out.print("정수입력 : ");
		int num1 = scanner.nextInt();
		int num12 = scanner.nextInt();
		int result = 0;
		
		if(num1>=num12) {
			result = num1-num12;
		}else {
			result = num12-num1;
		}
		System.out.println(result);
		
		//3
		System.out.print("정수입력( 0 / 1) : ");
		int num21 = scanner.nextInt();
		int num22 = scanner.nextInt();
		int num23 = scanner.nextInt();
		int num24 = scanner.nextInt();
		
		int sum = num21+num22+num23+num24;
		if(sum==4) {
			System.out.println("윷");
		}else if(sum==3) {
			System.out.println("걸");
		}else if(sum==2) {
			System.out.println("개");
		}else if(sum==1) {
			System.out.println("도");
		}else if(sum==0) {
			System.out.println("모");
		}else {
			System.out.println("다시 입력");
		}
		
		
		//4
		System.out.print("정수입력 : ");
		int num3 = scanner.nextInt();
		
		for(int i=1;i<=num3;i++) {
			System.out.print("*");
		}

	}

}
