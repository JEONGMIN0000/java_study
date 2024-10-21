package study.iter;

public class Iteration03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			
			System.out.println("for i 내부 실행문 시작" + i);
			
			for(int j=1;j<=3;j++) {
				
				System.out.println("for j 실행문" + j);
				
			}
			
			System.out.println("for i 내부 실행문 끝");
			
		}
		
		//방 3개 2번 쓸기 3번 닦기 1번 쓰레기 정리
		
		for(int i=0;i<3;i++) {
			
			System.out.println("방"+(i+1));
			
			int j=1;
			while(j<=2) {
				System.out.println("쓸기");
				j++;
			}
			
			for(int k=1; k<=3; k++) {
				System.out.println("닦기");
			}
			
			System.out.println("쓰레기 정리");
			
		}
			
	}

}
