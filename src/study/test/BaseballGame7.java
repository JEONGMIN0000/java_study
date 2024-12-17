package study.test;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int ball=0; // 1~ 10
		int input=0; // 1 ~ 10
		int ballCount=0;
		int outCount=0;
		int strikeCount=0;
		int m=0; //선수 인덱스
		int base=0;
		int score=0;
		int finalScore=0;
		int homeRun=0;
		
		boolean isBat = true; //출전 메세지
		
		String[] memberArr= {"김일번", "김이번", "김삼번","김사번","김오번", "김육번", "김칠번", "김팔번", "김구번"};
		int[] homeRunRate= new int[9]; //홈런확률
		int[] homeRunCount= new int[9]; //홈런수
		int[] hitCount= new int[9]; //안타수
		int[] ballNetCount= new int[9]; //볼넷수
		int[] memberOutCount= new int[9]; //아웃수
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
					System.out.println();
					System.out.printf( "%d번 타자 %s 선수 등장! ( 타율 : %.2f , %d홈런 %d안타 %d볼넷 %d아웃 ) \n", 
							(m+1), memberArr[m], hitRate[m], homeRunCount[m], hitCount[m], ballNetCount[m], memberOutCount[m]);
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
				
				//홈런
				homeRun = (int)(Math.random()*100)+1; 
				
				//선수별 홈런확률
				for(int j=1;j<=3;j++) { 
					homeRunRate[j]=(int)(Math.random()*60)+1; 
				}
				
				//타석수
				batCount[m]++; 
				
				if(input - 3 <= ball && ball <= input + 3 ){ // 안타 (+-3차이까지)
					
					if(homeRun<=homeRunRate[m]) { // 홈런 점수 증가 
						homeRunCount[m]++;
						System.out.println("홈런");
						score+=(base+1);
						base=0;
					}else {
						hitCount[m]++; //안타수
						System.out.println("안타");
					}
					
					base++; //베이스 진출
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
							memberOutCount[m]++;
							System.out.println("아웃");
							
							m++; //선수 ++;
							strikeCount=0; //스트라이크 초기화
							ballCount=0; //볼 초기화
						}
						
					} else{ //볼
						ballCount++;
						System.out.println("볼");
						
						if(ballCount==4) { //볼 -> 안타
							hitCount[m]++;
							ballNetCount[m]++;
							System.out.println("볼 4 안타");
							base++; //베이스 진출
							
							m++; //선수 ++;
							isBat = true; //출전 메세지
							strikeCount=0; //스트라이크 초기화
							ballCount=0; //볼 초기화
						}
					}
				
					if(outCount==3) { //회차종료
						System.out.println(i + "회차 점수 : " + score); //해당 회차 점수 출력
						
						finalScore += score; //전 회차 점수 합
						
						base=0; //베이스 초기화
						
						score=0;  //해당 회차 점수 초기화
						
						break;
					}
				}
				
				if(base==4) { // 점수 증가 
					score++;
					base=3;
				}
				
				if(m>=8) { //선수 로테이션
					m=0;
				}
				
			}
			
		
		}
		
		System.out.println();
		System.out.println("야구게임 끝!");
		System.out.println("최종 점수 : " + finalScore);
		
		
		
		
		

	}

}
