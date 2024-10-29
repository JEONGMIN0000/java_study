package study.rand;

import java.util.Random;

public class Rand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//난수 ( 랜덤값 )
		
		for(int i=0 ;i<10; i++) {
			//1~10 까지 중에 랜덤값
			System.out.println( (int)(Math.random()*10) +1 );
			//0<=  <1
			// 1~10 중 랜덤값
			
			/*
			 0.0 = 0.12313
			 0.5 = 5.12313
			 0.7 = 7.12331
			 0.9 = 9.12313
			 *10 + 1
			 
			 */
		}
		System.out.println("---------");
		for(int i=0 ;i<10; i++) {
			//1~5 랜덤값
			System.out.println( (int)(Math.random()*5) + 1 );
		}
		System.out.println("---------");
		for(int i=0 ;i<10; i++) {
			//1~45 랜덤값
			System.out.println( (int)(Math.random()*45) + 1 );
		}
		System.out.println("---------");
		for(int i=0 ;i<10; i++) {
			//100~150 랜덤값
			System.out.println( (int)(Math.random()*51) + 100 );
		}
		
		System.out.println("---------");
		for(int i=0 ;i<10; i++) {
			//30~50 랜덤값
			System.out.println( (int)(Math.random()*21) + 30 );
		}
		
		
		Random random = new Random();
		System.out.println("---------");
		for(int i=0 ;i<10; i++) {
			System.out.println(random.nextInt(10)+1); //0<= < 10
		}
		System.out.println("---------");
		for(int i=0 ;i<10; i++) {
			System.out.println(random.nextInt(10, 15)); 
			//  10<=  <15
		}
	}

}
