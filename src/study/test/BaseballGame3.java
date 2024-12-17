package study.test;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int ball=0; // 1~ 10
		int input=0; // 1 ~ 10
		int outCount=0;
		int m=0; //선수 인덱스
		
		String[] memberArr= {"김일번", "김이번", "김삼번","김사번","김오번", "김육번", "김칠번", "김팔번", "김구번"};
		int[] hitCount= new int[9]; //안타수
		int[] hitRate= new int[9]; //타율
		int[] batCount = new int[9]; //타석수
		
		
		for(int i=1;i<=3;i++) {
			
			System.out.println();
			System.out.println(i + "회 시작");
			outCount=0;
			
			while(true) {
				
				if(batCount[m]==0) { //첫 타석일 경우 타율 =0
					hitRate[m]=0;
				}else {
					hitRate[m] = hitCount[m]/batCount[m]; //타율=안타수/타석수
				}
				
				System.out.println((m+1) + "번 타자 " + memberArr[m] + "선수 등장! ( 타율 : " + hitRate[m] + ")");
				
				//사용자
				System.out.print("사용자 입력 (1 ~ 10) : ");
				input = scanner.nextInt();
				
				//투수
				ball=(int)(Math.random()*10)+1;
				System.out.println(ball);
				
				//타석수
				batCount[m]++; 
				
				
				if(input != ball) { //아웃
					outCount++;
					System.out.println("아웃");
				}else { //안타
					hitCount[m]++; //안타수
					System.out.println("안타");
				}
				
				if(outCount==3) { //회차종료
					break;
				}
				
				//선수 ++;
				m++; 
				
				if(m>=8) { //선수 로테이션
					m=0;
				}
				
			}
			
		
		}
		
		System.out.println("야구게임 끝!");
		
		
		
		
		

	}

}
