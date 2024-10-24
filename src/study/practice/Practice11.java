package study.practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		//1 
		System.out.print("정수입력 : ");
		int num1 = scanner.nextInt();
		
		if(num1%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		//2
		System.out.print("정수입력 : ");
		int num2 = scanner.nextInt();
		
		if(num2%7==0) {
			System.out.println("7의 배수");
		}else {
			System.out.println("7의 배수 아님");
		}
		
		//3
		int sum = 0;
		for(int i=1;i<=1000;i++) {
			if(i%5==0) {
				sum=sum+i;
			}
		}
		System.out.println("5의 배수의 합 : " + sum);
		
		//4
		System.out.print("정수입력(1-50) : ");
		int num3 = scanner.nextInt();
		for(int i=1;i<=num3;i++) {
			System.out.print("*");
		}
		System.out.println();
		
		//5
		int sum2 = 0;
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				sum2=sum2+i;
			}else if(i%2==0) {
				sum2=sum2-i;
			}
		}
		System.out.println(sum2);
		
		//6
		int sum3 = 0;
	
		for(int i=1;sum3<1000;i++) {
			sum3 = sum3+i;
		}
		System.out.println(sum3);
		
		//6-2
		sum3 = 0;
		int j=1;
		while(sum3<1000) {
			sum3 = sum3+j;
			j++;
		}
		System.out.println(sum3);
		
		//7
		System.out.print("정수입력(1-9) : ");
		int num4 = scanner.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(num4 + "*" + i + "=" + num4*i);
		}
		
	}

}
