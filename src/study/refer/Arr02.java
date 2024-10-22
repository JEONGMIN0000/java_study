package study.refer;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[]
		//int[][][]
		//int[][][][]
		int[][] nArr1 = new int[3][5];
		/*
		 ㅁㅁㅁㅁㅁ
		 ㅁㅁㅁㅁㅁ
		 ㅁㅁㅁㅁㅁ
		*/
		
		int[][] nArr2 = new int[2][3];
		/*
		 ㅁㅁㅁ
		 ㅁㅁㅁ
		*/
		
		int[][] nArr3 = {{1,2,3},{4,5,6}};
		/*
		 123
		 456
		*/
		//System.out.println(nArr3[2][1]); XXXXXX
		
		for(int i=0;i<nArr3.length;i++) {
			for(int j=0;j<nArr3[i].length;j++) {
				System.out.print(nArr3[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
	}

}
