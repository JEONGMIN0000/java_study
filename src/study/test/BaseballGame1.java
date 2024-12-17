package study.test;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int ball=0; // 1~ 10
		int input=0; // 1 ~ 10
		int outCount=0;
		
		
		for(int i=1;i<=3;i++) {
			
			System.out.println();
			System.out.println(i + "회 시작");
			outCount=0;
			
			while(true) {
				
				//사용자
				System.out.print("사용자 입력 (1 ~ 10) : ");
				input = scanner.nextInt();
				
				//투수
				ball=(int)(Math.random()*10)+1;
				System.out.println(ball);
				
				if(input != ball) { //아웃
					outCount++;
					System.out.println("아웃");
				}else { //안타
					System.out.println("안타");
				}
				
				if(outCount==3) { //회차종료
					break;
				}
				
			}
			
		
		}
		
		System.out.println("야구게임 끝!");
		
		
		
		
		

	}

}
