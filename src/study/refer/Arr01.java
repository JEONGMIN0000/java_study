package study.refer;

public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int score1 = 100;
		int score2 = 85;
		int score3 = 75;
		int score4 = 65;
		int score5 = 40;
		
		int sum = 0;
		sum = score1+score2+score3+score4+score5;
		double avg = sum/5.0;
		
		System.out.printf("총점 : %d  평균 : %f \n", sum, avg);
		
		int[] scoreArr = {100, 85, 75, 65, 40};
		
		sum = 0;
		sum = scoreArr[0] +  scoreArr[1] + scoreArr[2]+ scoreArr[3]+ scoreArr[4];
		
		sum=0;
		for(int i=0;i<=4;i++) {
			sum = sum + scoreArr[i];
		}
		System.out.println("총합 : " + sum);
		
		int[] pointArr = null;
		//pointArr = {1,2,3,4,5}; XXX
		
		pointArr = new int[] {1,2,3,4,5}; // O
		
		pointArr = new int[5];
		pointArr[0] = 1;
		pointArr[1] = 2;
		pointArr[2] = 3;
		pointArr[3] = 4;
		pointArr[4] = 5;
		
		for(int i=0;i<5;i++) {
			pointArr[i] = i+1;
		}
		
		for(int i=1;i<=5;i++) {
			pointArr[i-1] = i;
		}
		
		int[] intArr = new int[5];
		double[] doubleArr = new double[10];
		String[] strArr = new String[30];
		boolean[] boolArr = new boolean[4];
		
		for(int i=0;i<intArr.length;i++) {
			System.out.print(intArr[i]+ " ");
		}
		System.out.println();
		
		for(int i=0;i<doubleArr.length;i++) {
			System.out.print(doubleArr[i]+ " ");
		}
		System.out.println();
		
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+ " ");
		}
		System.out.println();
		
		boolArr[2]=true;
		for(int i=0;i<boolArr.length;i++) {
			System.out.print(boolArr[i]+ " ");
		}
		System.out.println();
		
	}

}
