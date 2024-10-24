package study.practice;

import java.util.Scanner;

public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		1.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		몇번째 수인가요? : 그에 해당하는 수를 출력
		ex) 10 20 30 50 90
		몇번째 수인가요? 5
		결과 : 90

		2.
		+자연수 (정수) 5개의 수를 차례대로 입력 받는다.
		받은후에 순서를 거꾸로 출력하세요.
		ex) 1 2 3 4 5
		결과 : 5 4 3 2 1

		3. 4x4 배열을 생성하여, 값을 아래와 같이 저장후 출력 하시오.
		(*반복문을 사용하면 좀 더 편하게 저장이 가능합니다.)
		1 2 3 4
		5 6 7 8
		9 10 11 12
		13 14 15 16
		*/
		
		//1
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수입력 (5개) : ");
		
		int[] arr1 = new int[5];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = scanner.nextInt();
		}
		
		System.out.print("몇번째 수인가요? : ");
		int num1 = scanner.nextInt();
		
		System.out.println(arr1[num1-1]);
		
		//2
		
		System.out.print("수입력 (5개) : ");
		int[] arr2= new int[5];
		for(int i=arr2.length-1;i>=0;i--) {
			arr2[i] = scanner.nextInt();
		}
		for(int i=0;i<=4;i++) {
			System.out.print(arr2[i] +" ");
		}
		System.out.println();
		
		//3
		 // int [][] nArr = new int [4][4]; // 이거나
	      //int [][] nArr1 = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}}; //이거 둘 중 하나만 사용해도 됨
	      
	      int [][] nArr1 = new int [4][4];
	      
	      int num = 1;
	      for(int i=0; i<4; i++) {
	         for(int j=0; j<4; j++) {
	            //i : 0 0 0 0 1 1 1 1 ...
	            //j : 0 1 2 3 0 1 2 3 ...
	            //num:1 2 3 4 5 6 7 8 ...
	            nArr1[i][j] = num;
	            num = num+1;
	         }
	      }
	      
	      for(int i=0; i<nArr1.length; i++) {
	         for(int j=0; j<nArr1.length; j++) {
	            //System.out.print(nArr1[i][j] + " ");
	            System.out.printf("%3d", nArr1[i][j]); //%3d를 사용하면 더 정렬된 느낌을 줄 수 있음
	         }
	         System.out.println();
	      }
		
	}

}
