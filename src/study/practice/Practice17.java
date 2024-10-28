package study.practice;

import java.util.Scanner;

public class Practice17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[4][4];
		int num = 1;
		
		/*  //1
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				//4*4 
				//i:0~3	0	1	2	3
				//j:0~3	0123012301230123
				arr[i][j] = num;
				num++;
			}
		}
		*/
		
		/*//2
		for(int j=0; j<4; j++) {	//j:0
			for(int i=0; i<4; i++) {	//i:0123
				//4*4 
				//i:0~3	0	1	2	3
				//j:0~3	0123012301230123
				arr[i][j] = num;
				num++;
			}
		}
		
		for(int i=0; i<4; i++) {	//i:0123
			for(int j=0; j<4; j++) {	//j:0
				arr[j][i] = num;
				num++;
			}
		}
		
		for(int i=0; i<4; i++) {	//i:0123
			for(int j=0; j<4; j++) {	//j:0
				arr[i][j] = (i+1) + (4*j);
			}
		}
		*/
		
		
		/*
		//3
//		num = 16;
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<4; j++) {
//				arr[i][j] = num;
//				num--;
//			}
//		}
		
		num = 1;
		for(int i=3; i>=0; i--) {
			for(int j=3; j>=0; j--) {
				arr[i][j] = num;
				num++;
			}
		}
		*/
		
		//4
		num = 1;
		for(int i=3; i>=0; i--) {
			for(int j=3; j>=0; j--) {
				arr[j][i] = num;
				num++;
			}
		}
		
		num = 16;
		for(int i=0; i<4; i++) {	//i:0123
			for(int j=0; j<4; j++) {	//j:0
				arr[j][i] = num;
				num--;
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}

}


/*
 
//2차원 배열과 인덱스 조정하기.
//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
1.
(i*4)+(j+1)
1  2  3  4		00 01 02 03	
5  6  7  8  	10 11 12 13
9  10 11 12		20 21 22 23
13 14 15 16		30 31 32 33

2.
(i+1)+(j*4)
1 5 9  13		
2 6 10 14
3 7 11 15
4 8 12 16

3.
16-(i*4)-j

16 15 14 13
12 11 10 9
8  7  6  5
4  3  2  1

4.
16 12 8 4
15 11 7 3
14 10 6 2
13 9  5 1

*/