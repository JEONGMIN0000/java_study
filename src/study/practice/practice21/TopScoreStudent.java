package study.practice.practice21;

public class TopScoreStudent {
	public static void main(String[] args) {
		// 배열 생성
		String[] names = { "Elena", "Suzie", "John", "Emily", "Neda",
				"Kate", "Alex", "Daniel", "Hamilton" };
		int[] scores = { 65, 74, 23, 75, 68, 96, 88, 98, 54 };

		// 1등 인덱스 검색
		int i = topIndex(scores);
		
		System.out.println(i);

		// 결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
	}

	// 정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
	public static int topIndex(int[] arr) {
		/* 해당 함수를 완성하세요. */
		
		int maxIndex = 0;
		int maxValue = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			if( maxValue < arr[i] ) {  //현재까지의 제일 큰 값 < 지금 i 인덱스위치 값이 더 크다
				maxIndex = i;
				maxValue = arr[i];
			}
		}
		
		return maxIndex;
		
		/*
		int maxIndex = 0;
		boolean isMax = true;
		
		for(int i=0; i<arr.length; i++) {
		
			isMax = true;
			for(int j=i+1; j<arr.length; j++) {
				if( arr[i] < arr[j]) {
					isMax = false;
					break;
				}
			}
			
			if(isMax) {  //현재 i 인덱스가 제일 큰 값
				maxIndex = i;
				break;
			}
		}
		
		return maxIndex;
		*/
	}
}
