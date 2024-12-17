package study.test;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int ball=0; // 1~ 10
		int input=0; // 1 ~ 10
		int ballCount=0;
		int outCount=0;
		
		

		while(true) {
				
				//사용자
				System.out.print("사용자 입력 (1 ~ 10) : ");
				input = scanner.nextInt();
				
				//투수
				ball=(int)(Math.random()*10)+1;
				System.out.println(ball);
				
				//공 ++
				ballCount++;
				
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
			
	
		System.out.println("야구게임 끝!");
		
		
		
		
		

	}

}
