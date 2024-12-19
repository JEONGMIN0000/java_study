package study.practice.practice22;

import java.util.ArrayList;

public class Refrigerator {
	
	String brand;
	int liter;
	int doorCount; 
	
	boolean isPowerOn;
	int temperature;
	
	IceTray iceTray;
	ArrayList<IceTray> iceTrayList;
	
	// 온도 : -5 ~ 4    -10 ~ 6
	int maxTemperature;
	int minTemperature;
	
	public Refrigerator() {
		maxTemperature = 4;
		minTemperature = -5;
	}
	
	// "최하" "하" "중" "상" "최상"
	//  1     2    3   4   5
	
	/*
	 * 냉장고
			- 어느 브랜드인지
			- 몇리터 짜리인지
			- 전원을 켤수 있다
			- 온도조절을할수있다(온도 up 또는 온도 down)
			- 문이 몇개인지
	 */
	
	public void powerOn() {
		isPowerOn = true;
	}
	
	public void tempUp(int tempValue) { // tempUp(5);
		this.temperature += tempValue;  
	}
	
	public void tempUp() { //온도 1도 올리기
		if(temperature + 1 <= maxTemperature) {
			this.temperature += 1;  
		}
	}
	
	public int tempDown() { //온도 1도 내리고, 최종 온도를 반환
		this.temperature -= 1;
		return temperature;
	}
	
	//  modifyTemp(1);
	//  modifyTemp(-2);
	public void modifyTemp(int tempValue) {	//온도조절
		this.temperature += tempValue;
	}
	
	//modifyTemp(true); 1도 증가
	//modifyTemp(false); 1도 감소
	public void modifyTemp(boolean isUp) { // 
		if(isUp) {
			this.temperature += 1;
		} else {
			this.temperature -= 1;
		}
	}
	
}
