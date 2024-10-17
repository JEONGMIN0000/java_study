package study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();	// 10\n

		System.out.println(num == 10); // true false
		// == 같다 비교연산자
		
		scanner.nextLine(); //엔터까지 입력 받아라 남은 \n 청소용
		
		String str = scanner.nextLine(); // \n
		
		System.out.println(str); //밥
		System.out.println(str == "밥"); // X
		System.out.println(str .equals("밥"));
		System.out.println("밥" .equals(str));
		// 문자열 비교시, == X  equals O
		
		
		
		
	}

}
