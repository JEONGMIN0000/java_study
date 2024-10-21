package study.iter;

public class Iteration02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			System.out.println("피곤");
		}
		
		int j=1;
		while(j<=5) {
			System.out.println("졸림");
			j++;
		}
		
//		while(true) {
//			System.out.println("무한반복");
//		}
		
		int k=10;
		do {
			System.out.println("k do while");
		}while(k<5);
		
		
		k=1;
		while(true) {
			//무한
			k++;

			
			if(k==10) {
				break; //멈추기
			}
			
			System.out.println(k);
		}
		
		System.out.println("=============");
		
		for(int i=1;i<=10;i++) {
			
			if(i==5) {
				continue;
			}
			
			System.out.println(i);
			
			if(i==5) {
				break;
			}
		}
			
	}

}
