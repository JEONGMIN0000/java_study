package study.practice;

import java.util.Scanner;

import javax.swing.DefaultListCellRenderer;

public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//1번

		// 1~24 중 하나의 정수를 입력받습니다. 범위를 넘어선 값을 입력할 수도 있음.
		// 입력받은 숫자를 보고 아래 기준에 맞게 출력하세요.
		// 1) 범위를 벗어나면, "잘못입력했습니다." 라고 출력
		// 2) 시간<=12 오전입니다. 시간>12 오후입니다.
		// 3) 1~6시 이른 오전입니다. 7~12 늦은 오전입니다.
		// 4) 13~18시 이른 오후입니다. 19~24 늦은 오후입니다.

		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력하세요(1~24) : ");
		int time = scanner.nextInt();
		
		if( time >= 1 && time <= 24 ) {	//정상범위 1~24
			
			//정상범위 1~24 
			if( time <= 12) {	// 1~12
				//오전
				//이른/늦은
				System.out.println("오전입니다.");
				
				if( time <= 6) {
					System.out.println("이른 오전입니다.");
				} else {
					System.out.println("늦은 오전입니다.");
				}
			} else {	// 13 ~ 24
				//오후
				//이른/늦은
				System.out.println("오후입니다.");
				if( time <= 18 ) {
					System.out.println("이른 오후입니다.");
				} else {
					System.out.println("늦은 오후입니다.");
				}
			}
		} else { //잘못된 범위 값을 입력한 경우
			System.out.println("잘못입력했습니다.");
		}
		*/
		
		/*
		//입력에 따른 출력 예시
		26
		"잘못입력했습니다."

		5
		오전입니다.
		이른 오전입니다.

		9
		오전입니다.
		늦은 오전입니다.

		21
		오후입니다.
		늦은오후입니다.
		*/		
		
		
/*

		//2번 아래 코드를 if문으로 변경

		int diceNum = 120; //주사위 수 1~6

		// if문 변환
		switch(diceNum) {
		case 1: // diceNum == 1
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		case 5:
			System.out.println("5");
			break;
		default:
			System.out.println("6");
			//case 6:
		}
		
		if(diceNum == 1) {
			System.out.println("1");
		} else if (diceNum == 2) {
			System.out.println("2");
		} else if (diceNum == 3) {
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
		} else if (diceNum == 4) {
			System.out.println("4");
			System.out.println("5");
		} else if (diceNum == 5) {
			System.out.println("5");
		} else {
			System.out.println("6");
		}
*/


		//3번 아래 코드를 swtich 문으로 변경
/*
		String localNum = "051";
		// switch 문으로 변경
		if ( localNum.equals("031") ){
			System.out.println("경기도입니다");
		}
		if ( localNum.equals("02") ){
			System.out.println("서울입니다.");
		}
		if ( localNum.equals("041") ){
			System.out.println("충남입니다");
		}
		if ( localNum.equals("051") ){
			System.out.println("부산입니다");
		}
		
		switch (localNum) {
		case "031":
			System.out.println("경기도입니다");
			break;
		case "02":
			System.out.println("서울입니다.");
			break;
		case "041":
			System.out.println("충남입니다");
			break;
		case "051":
			System.out.println("부산입니다");
			break;
		}
		*/

		//4번 아래 코드를 switch 문으로 변경
		// *** switch 문은 범위를 지정할 수 없습니다.
		// 결과 값만 동일하게 나오도록 만들어보세요.
		// 단, 점수는 100점까지로 간주합니다.
		// 점수는 0~100 점 중에 score로 주어진다.
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scanner.nextInt();

		// 88
		if( score >= 90) {
			System.out.println("학점 A");
		} else if ( score >= 80 ) {
			System.out.println("학점 B");
		} else if (score >= 70) {
			System.out.println("학점 C");
		} else if (score < 70) {
			System.out.println("학점 F");
		}
		
		//100 / 10 = 10.0 -> 10
		// 99 / 10 = 9.9 -> 9
		// 91 / 10 = 9.1 -> 9
		// 75 / 10 = 7.5 -> 7
		
		int score10 = score/10;
		
		switch( score/10 ) {
		case 10:
		case 9:
			System.out.println("학점 A");
			break;
		case 8:
			System.out.println("학점 B");
			break;
		case 7:
			System.out.println("학점 C");
			break;
		default:
			System.out.println("학점 F");
		}
		
		
		switch(score) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90: 
			System.out.println("학점 A");
			break;
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
		case 84:
		case 83:
		case 82:
		case 81:
		case 80:
			System.out.println("학점 B");
			break;
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
		case 72:
		case 71:
		case 70:
			System.out.println("학점 C");
			break;
		default :
			System.out.println("학점 F");				
		}
		
		*/
		
	}
	
}
