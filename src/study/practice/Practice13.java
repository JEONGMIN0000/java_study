package study.practice;

import java.util.Scanner;

public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		//1 
		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();	
		
		//2
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//3
		System.out.print("정수입력 : ");
		int num1 = scanner.nextInt();
		
		for(int i=1;i<=num1;i++) {
			if(num1%i==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//4
		System.out.print("정수입력 : ");
		int num2 = scanner.nextInt();
		for(int i=1;i<=num2;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=num2-1;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		//5
		int sum = 0;
		int total = 0;
		for(int i=1;i<=10;i++) {
			sum = sum+i;
			total = sum+total;
		}
		System.out.println(total);
		
		System.out.println("===========");
		
		//5-2
		sum=0;
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				sum=sum+j;
			}
			System.out.println();
		}
		System.out.println(sum);

		//6
		sum = 0;
		int i=0;
		for(i=1;sum<100;i++) {
			if(i%2!=0) {
				sum+=i;
			}else if(i%2==0) {
				sum-=i;
			}
		}
		System.out.println("100이상일 때 누적합 : "+ sum);
		System.out.println("100이상일 때 마지막으로 더한 값 : "+ (i-1));
		
		//6-2
		sum=0;
		i=1;
		while(true) {
			
			if(i%2!=0) {
				sum+=i;
			}else if(i%2==0) {
				sum-=i;
			}
			
			if(total >=100 ) {
				break;
			}
			
			i++;
		}
		System.out.println("100이상일 때 누적합 : "+ sum);
		System.out.println("100이상일 때 마지막으로 더한 값 : "+ i);
		
	}

}
