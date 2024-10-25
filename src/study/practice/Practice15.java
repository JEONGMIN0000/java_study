package study.practice;

import java.util.Scanner;

public class Practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				
				if(i>j) {
					arr[i][j] = 3;
				}else if(i<j) {
					arr[i][j] = 2;
				}else { //if(i==j)
					arr[i][j] = 1;
				}
				
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
		//그냥 반복문 출력
		for(int i=1;i<=arr.length;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("3");
			}
			System.out.print("1");
			for(int j=4-i;j>=0;j--) {
				System.out.print("2");
			}
			System.out.println();
		}
		
		
	}

}
