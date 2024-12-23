package study.inherit.inherit05;

import java.util.ArrayList;
import java.util.List;

import study.inherit.inherit04.v3.Cleaner;
import study.inherit.inherit04.v3.DustCleaner;

public class Car {
	// 필드
	public static final int FRONT_LEFT_TIRE = 0;
	public static final int FRONT_RIGHT_TIRE = 1;
	public static final int BACK_LEFT_TIRE = 2;
	public static final int BACK_RIGHT_TIRE = 3;
	
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	Tire[] tireArr;
	ArrayList<Tire> tireList;
	
	

	// 생성자
	public Car(Tire frontLeftTire, Tire frontRightTire, Tire backLeftTire, Tire backRightTire) {
		
		tireArr =  new Tire[4];
		tireList = new ArrayList<Tire>();
		
		tireArr[FRONT_LEFT_TIRE] = frontLeftTire;
		tireArr[FRONT_RIGHT_TIRE] = frontRightTire;
		tireArr[BACK_LEFT_TIRE] = backLeftTire;
		tireArr[BACK_RIGHT_TIRE] = backRightTire;
		
		tireList.add(frontLeftTire);
		tireList.add(frontRightTire);
		tireList.add(backLeftTire);
		tireList.add(backRightTire);
		
		
		this.frontLeftTire = frontLeftTire;
		this.frontRightTire = frontRightTire;
		this.backLeftTire = backLeftTire;
		this.backRightTire = backRightTire;
	}

	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		//if (frontLeftTire.roll() == false) {
		if (tireArr[FRONT_LEFT_TIRE].roll() == false) {
		//if (tireList.get(0).roll() == false) {
			stop();
			return FRONT_LEFT_TIRE; //0
		};
		//if (frontRightTire.roll() == false) {
		if (tireArr[FRONT_RIGHT_TIRE].roll() == false) {
			stop();
			return FRONT_RIGHT_TIRE; //1
		};
		//if (backLeftTire.roll() == false) {
		if (tireArr[BACK_LEFT_TIRE].roll() == false) {
			stop();
			return BACK_LEFT_TIRE; //2
		};
		//if (backRightTire.roll() == false) {
		if (tireArr[BACK_RIGHT_TIRE].roll() == false) {
			stop();
			return BACK_RIGHT_TIRE; //3
		};
		return 10; //정상
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
