package study.practice.practice19;

import java.util.Scanner;

public class Monitor {
	
	String company;
	int inch;
	int price;
	String color;
	int maxX;
	int maxY;
	
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setXY(int x, int y) {
		this.maxX = x;
		this.maxY = y;
	}

	Monitor(String company, int inch,  int price){
		this.inch=inch;
		this.company=company;
		this.price=price;
	}
	
	
	public void powerOn(){
		System.out.println("전원이 켜졌습니다");
	}
	
	public int addPrice(int add){
		this.price = this.price + add;
		return this.price;
	}
	
	public void printInfo() {
		System.out.printf("%s 회사 %d인치 모니터, %d원, %s, 해상도 : %d * %d \n", company, inch, price, color, maxX, maxY);
	}
	
	
	
}

