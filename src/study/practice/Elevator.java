package study.practice;

public class Elevator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 생성
		int a = 13;
		int b = 7;
		int c = 10;
		// 결과 출력
		System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
		}
	
		public static String guide(int floor) {
		
			if(floor>=1 && floor<=10) {
				return "저층";
			} else if(floor>=11 && floor<=20) {
				return "고층";
			} else {
	            // 예외 처리 또는 범위 외의 경우를 추가
	            return "잘못된 층";
	        }

	}

}
