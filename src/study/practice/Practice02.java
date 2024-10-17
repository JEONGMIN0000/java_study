package study.practice;

public class Practice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		String brand = "로지택";
		String product = "mx kyes";
		int price = 135000;	
		String number = "332L1545K";
		
		//2
		String company = "SAMSUNG";
		int inch = 24;	
		String color = "black";
		boolean port = true;	
		boolean sound = false;
		
		//3
		double pie = 3.14;
		System.out.println("원주율 : " + pie);
		
		//4
		String mathScore = "85";
		String englishScore = "90";
		String artScore = "70";
		
		int math = Integer.parseInt(mathScore) ;
		int english = Integer.parseInt(englishScore);
		int art = Integer.parseInt(artScore);
		
		int total = math + english + art;
		System.out.println("총점 : " + total);
		
		//5
		int num1 = 4;
		int num2 = 10;
		double num3 = num1 / (double)num2 ;
		System.out.println( num3 );
		
	}

}
