package study.practice;

import java.util.Scanner;

public class Monitor {
	
	int inch;
	String brand;
	String name;
	
	Monitor(){
		
	}
	
	Monitor(int inch, String brand, String name){
		this.inch=inch;
		this.brand=brand;
		this.name=name;
	}
	
	void printInfo(){
		System.out.printf("제조사 : %s, 모델명 : %s , 인치 : %d \n", brand, name, inch);
	}
	
}

