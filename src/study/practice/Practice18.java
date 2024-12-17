package study.practice;

import java.util.Scanner;

public class Practice18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		//1
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i + j == 6) {
					System.out.printf("%d + %d = 6 \n", i, j);
				}
			}
		}
		
		//2
		int[] lotto = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			//중복
			for(int j=0;j<i;j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
				
			}
		}
		
		//배열확인
		for(int i=0;i<lotto.length;i++) {
			System.out.print (lotto[i] + " ");
		}
		
		System.out.println ();
		
		//3
		
		int[] one = new int [5];
		int[] two = new int [5];
		int[] three = new int [5];
		int sum = 0;
		int totalSum = 0;
		
		for(int i=1;i<=3;i++){
			System.out.printf("%d반 : ", i);
			for(int j=0;j<one.length;j++) {
				one[j] = scanner.nextInt();
				sum+=one[j];
			}
			
			System.out.printf("%d반 평균 : %d \n" , i, sum/5);
			totalSum += (sum/5);
			sum = 0;
			System.out.printf("평균 : %d \n" ,totalSum/3);
			
		}
		
		//4
		int[][] arr = {
							{10, 20, 30},
							{20, 30, 40},
							{30, 40, 50}
						};
		
		int row = arr.length;
		int col = arr[0].length;
		
		int rowTotal = 0;
		int colTotal= 0;
		int total = 0;
		
		int[][] newArr = new int [row+1][col+1];
		
		//행 추가
		for(int i=0;i<row;i++) {
			rowTotal = 0;
			for(int j=0;j<col;j++) {
				newArr[i][j] = arr[i][j];
				rowTotal += arr[i][j];
			}
			newArr[i][col] = rowTotal;
		}
		
		//열 추가
		for(int j=0;j<col;j++) {
			colTotal = 0;
			for(int i=0;i<row;i++) {
				newArr[i][j] = arr[i][j];
				colTotal += arr[i][j];
			}
			newArr[row][j] = colTotal;
		}
		
		//전체합추가
		for(int j=0;j<row;j++) {
				total += newArr[row][j];
		}
		
		newArr[row][col] = total;
		
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=col;j++) {
				System.out.print(newArr[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		

	}
}
