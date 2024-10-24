package study.practice;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korea = scanner.nextInt();
		
		System.out.print("수학 : ");
		int math = scanner.nextInt();
		
		System.out.print("영어 : ");
		int english = scanner.nextInt();
		
		int sum = korea + math + english;
		
		double avg = sum/3.0;
		
		if((korea>=40 && korea<=100)&&(math>=40 && math<=100)&&(english>=40 && math<=100) &&(avg>=60 && avg<=100)){
			if(avg>=60 && avg<=100) {
				System.out.println("국어 : " + korea);
				System.out.println("수학 : " + math);
				System.out.println("영어 : " + english);
				System.out.println("합계 : " + sum);
				System.out.println("평균 : " + avg);
				System.out.println("축하합니다. 합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}else {
			System.out.println("불합격입니다.");
		}
		
	}

}
