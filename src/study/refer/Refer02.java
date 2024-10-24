package study.refer;

public class Refer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//enum 써보기
		
		String day = "MONDAY";
		String day2 = "TUESDAY";
		String day3 = "FRIDAY";
		String today = "WEDNESDAY";
		
		today = "FRODAY";
		
		//if(today == day3) {
		if(today.equals(day3)) {
			System.out.println("퇴근준비~하자~");
		}
		
		Week day11 = Week.TUE;
		Week day22 = Week.FRI;
		
		if(day22 == Week.FRI) {
			System.out.println("금요일 퇴근준비");
		}
		
		//메뉴 : 짜장면 짬뽕 탕수육
		//         1   2    3
		
		String menu = "짜장면"; //"짬뽕";
		int menu2 = 3;
		
		Menu memu3 = Menu.JMP;
	}

}











