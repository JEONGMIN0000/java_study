package study.var;

import java.util.Scanner;

public class Variable05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "test";

		System.out.println("출력 1");
		System.out.println("출력 2");
		System.out.println(s);
		
		System.out.print("출력 3");
		System.out.print("출력 4");
		System.out.print(s);
		
		int hour = 10;
		int minute = 26;
		
		// 현재 10시 26분 입니다.
		System.out.println("현재" + hour + "시" + minute + "분 입니다." );
		System.out.printf( "현재  %d시 %d분 입니다.\n", hour, minute);
		
		double rate = 1.15512;
		System.out.printf("%10.2f %%", rate);
		// \\
		System.out.println(); // 출력내용 X 줄바꿈 O

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String input = scanner.nextLine();
		System.out.println(input);
		
		System.out.println("입력한 값은 : " + input);
		System.out.printf("입력한 값은 : %s \n" ,input);
		
		System.out.println("점수를 입력하세요 : " );
		int point = scanner.nextInt();
		//String -> int
		
		System.out.println(point);
		
	}

}
