package study.cond;

public class Cond01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if문
		
		int num = 14;
		int x = 10;
		
		if(num>10) {
			System.out.println("확인결과");
			System.out.println("10보다 크다");
			x = 20 ;
			int y = 30;
		}else {
			System.out.println("10보다는 안큼");
		}
		
		boolean b = num ==15; // true / false
		
		if(!b) {
			System.out.println("한번더확인결과");
			System.out.println("15랑 같다");
			int z = 10;
		}
		
		int y = 44;
		int z = 222;
		
		System.out.println("끝");
	}

}
