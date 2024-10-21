package study.practice;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		for.
		1) i가 0~10으로 11번 반복
		2) i가 1~9로 9번 반복
		3) i가 10 ~ 100 으로 10번 반복
		4) i가 25 50 75 100 해서 4번 반복

		while.
		5) i가 50 ~ 55로 6번 반복
		6) i가 10 ~ 1로 10번 반복
		7) i가 30 ~ 0으로 5씩 감소하면서 7번 반복
		8) i가 30 ~ 5으로 5씩 감소하면서 6번 반복
		9) i가 25 ~ 0으로 5씩 감소하면서 6번 반복
		*/
		
		for(int i=0;i<=10;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		for(int i=10;i<=100;i=i+10) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
		for(int i=25;i<=100;i=i+25) {
			System.out.print(i+ " ");
		}
		System.out.println();
		
//		for(int i=1;i<=4;i++) {
//			System.out.print(i*25+ " ");
//		}
//		System.out.println();
		
		int i=49;
		while(i<=55) {
			System.out.print(i+ " ");
			i++;
		}
		System.out.println();
		
//		i=50;
//		while(true) {
//			System.out.print(i+ " ");
//			i++;
//			if(i>55) {
//				break;
//			}
//		}
//		System.out.println();
		
		i=10;
		while(i>=1) {
			System.out.print(i+ " ");
			i--;
		}
		System.out.println();
		
		i=30;
		while(i>=0) {
			System.out.print(i+ " ");
			i=i-5;
		}
		System.out.println();
		
		i=30;
		while(i>=5) {
			System.out.print(i+ " ");
			i=i-5;
		}
		System.out.println();
		
		i=25;
		while(i>=0) {
			System.out.print(i+ " ");
			i=i-5;
		}
		System.out.println();
	}

}
