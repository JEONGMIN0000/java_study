package study.test;

import java.util.Random;
import java.util.Scanner;

public class Roulette {

	int[] roulette = new int[6]; // 룰렛
	String id; // 기기 아이디
	String store; // 지점명
	int totalPoint; // 총합 포인트
	int success; // 성공
	int fail; // 실패
	int remain; // 잔여시도
	int sales; // 매출
	int charge; // 충전할 금액

	boolean isStart; // 시작 여부
	
	Random random = new Random(); // Random 객체를 전역 변수로 선언
    Scanner scanner = new Scanner(System.in); // Scanner 객체를 전역 변수로 선언

	public Roulette(String id, String store) {
		super();
		this.id = id;
		this.store = store;
		this.totalPoint = 0;
		this.success = 0;
		this.fail = 0;
		this.remain = 0;
		this.sales = 0;
		this.charge = 0;
	}

	public void start() {
		isStart = true;
		System.out.println("------------ 룰렛 게임 시작 ------------");
		
		while (isStart) {

			System.out.println("1. 충전 2. 게임시작 3. 마감"); // 선택
			int input = scanner.nextInt();

			switch (input) {
			case 1: //  충전
				modifyRemain(); 
				break;
			case 2: // 게임시작
				 if (remain > 0) {
					 playRoulette();
                 } else {
                     System.out.println("잔여 시도가 없습니다. 충전 후 시도하세요.");
                 }
				break;
			case 3: // 마감
				stopRoulette();
				break;
			default:
                 System.out.println("잘못된 입력입니다. 다시 선택해주세요.");

			}
		}
		
	}

	public void setRoulette() {

		for (int i = 0; i < 4; i++) { // 4칸은 점수 (1~4점)로 설정
			 roulette[i] = random.nextInt(4) + 1;
		}
		for (int i = 4; i < 6; i++) { // 나머지 2칸은 실패 (0점)로 설정
			roulette[i] = 0;
		}
		for (int i = 0; i < roulette.length; i++) { // 배열 섞기
			int j = (int) (Math.random() * roulette.length);
			int temp = roulette[i];
			roulette[i] = roulette[j];
			roulette[j] = temp;
		}
	}

	 void playRoulette() {
		while (isStart && remain > 0) {
			setRoulette(); // 룰렛 초기화
			int result = spinRoulette();
			rouletteResult(result);

			if (!isStart && remain <= 0) {
				isStart = false;
				System.out.println("게임 종료!!! 잔여 시도 없음");
				getRouletteInfo(); 
			}
		}
	}

	int spinRoulette() {

		int select = random.nextInt(6);
		System.out.println("룰렛 결과: " + (roulette[select] == 0 ? "실패" : roulette[select] + "점"));
		return roulette[select];
	}

	void rouletteResult(int result) {
		if (result == 0) {
			fail++;
		} else {
			success++;
			totalPoint += result;
		}
		remain--;
		System.out.println("남은 시도: " + remain);
	}

	 void modifyRemain() {
		// TODO Auto-generated method stub
		System.out.print("충전할 금액 : ");
		charge = scanner.nextInt();
		remain += charge / 500;
		sales+=charge;
		System.out.println("충전 완료! 잔여 시도: " + remain);
	}

	void getRouletteInfo() {
		System.out.println("------------ 게임요약 ------------");
		System.out.println("포인트: " + totalPoint);
		System.out.println("성공횟수: " + success);
		System.out.println("실패횟수: " + fail);
		System.out.println("총매출: " + sales + "원");
	}

	 void stopRoulette() {
		System.out.println(" 마감 ");
		getRouletteInfo();
		isStart = false;
	}

}
	
