package study.test;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int ball=0; // 1~ 10
		int input=0; // 1 ~ 10
		int ballCount=0;
		int outCount=0;
		int strikeCount=0;
		int m=0; //선수 인덱스
		
		boolean isBat = true; //출전 메세지
		
		String[] memberArr= {"김일번", "김이번", "김삼번","김사번","김오번", "김육번", "김칠번", "김팔번", "김구번"};
		int[] hitCount= new int[9]; //안타수
		double[] hitRate= new double[9]; //타율
		int[] batCount = new int[9]; //타석수
		
		
		for(int i=1;i<=3;i++) {
			
			System.out.println();
			System.out.println(i + "회 시작");
			outCount=0;
			
			while(true) {
				
				if(batCount[m]==0) { //첫 타석일 경우 타율 =0
					hitRate[m]=0;
				}else {
					hitRate[m] = (double)hitCount[m]/batCount[m]; //타율=안타수/타석수
				}
				
				if(isBat) {
					System.out.println((m+1) + "번 타자 " + memberArr[m] + "선수 등장! ( 타율 : " + hitRate[m] + ")");
					isBat = false;
				}
				
				//사용자
				input = (int)(Math.random()*100)+1;
				System.out.print("사용자 : ");
				System.out.println(input);
				
				//투수
				ball=(int)(Math.random()*100)+1;
				System.out.print("투수 : ");
				System.out.println(ball);
				
				//타석수
				batCount[m]++; 
				
				if(input - 3 <= ball && ball <= input + 3 ) { // 안타 (+-3차이까지)
					hitCount[m]++; //안타수
					System.out.println("안타");
					
					m++; //선수 ++;
					isBat = true; //출전 메세지
					strikeCount=0; //스트라이크 초기화
					ballCount=0; //볼 초기화
					
				} else { //아웃
					if((ball>=1 && ball<=20) || (ball>=50 && ball<=60) || (ball>=90 && ball<=100)) {  //스트라이크
						strikeCount++; //스트라이크수
						System.out.println("스트라이크");
						
						if(strikeCount==3) { //스트라이크 -> 아웃
							outCount++;
							System.out.println("아웃");
							
							m++; //선수 ++;
							isBat = true; //출전 메세지
							strikeCount=0; //스트라이크 초기화
							ballCount=0; //볼 초기화
						}
						
					} else{ //볼
						ballCount++;
						System.out.println("볼");
						
						if(ballCount==4) { //볼 -> 안타
							hitCount[m]++;
							
							m++; //선수 ++;
							strikeCount=0; //스트라이크 초기화
							ballCount=0; //볼 초기화
						}
					}
				
					if(outCount==3) { //회차종료
						break;
					}
				}
				
				if(m>=8) { //선수 로테이션
					m=0;
				}
				
			}
			
		
		}
		
		System.out.println("야구게임 끝!");
		
		
		
		
		

	}

}
