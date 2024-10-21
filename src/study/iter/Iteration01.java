package study.iter;

public class Iteration01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("월요일");
		System.out.println("월요일");
		System.out.println("월요일");
		System.out.println("월요일");
		System.out.println("월요일");
		
		
		for(int i=1;i<=10;i++) {
			System.out.println("화요일");
		}
		
		int i = 3;
		for(i=35;i<=45;i++) {
			System.out.println("수요일");
		}
		
		for(int j=1;i<=5;j++) {
			System.out.println("오늘은 공부" + j + " 일차");
		}
		
		// 10 ~ 100 까지 10 단위 합
		int sum=0;
		for(int n=10; n<=100;n=n+10) {
			sum = sum + n;
		}
		System.out.println("10~100까지(10 단위) 합 : " + sum);
		
		sum=0;
		for(int n=1; n<=10;n++) {
			sum = sum + n*10;
		}
		System.out.println("10~100까지(10 단위) 합 : " + sum);
		
		for(int k=2; k<20;k++) {
			
		}
		
		for(int k=400; k>10;k=k-50) {
			
		}
		
		for(int k=100; k>=90;k--) {
			
		}
		
		
		
	}

}
