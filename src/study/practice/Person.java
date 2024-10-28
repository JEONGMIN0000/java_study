package study.practice;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;

public class Person {
	
	String name;
	String gender; 
	int age;
	double height;
	double weight;
	String job;
	String blood;
	//boolean isHealthy; // true: 건강 / false : 건강 X
	int healthState; //10 매우건강 - 0 매우 나쁨
	boolean isSleep; // true: 수면중 / false : 수면중 X
	
	Person() {
		
	}
	
	Person(String name, int age, double height, double weight) {
		this(name,"남",age, height, weight, "무직", "A", 10, false);
	}
	
	Person(String name, String gender, int age, double height, double weight, String job, String blood, int healthState, boolean isSleep) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
		this.blood = blood;
		this.healthState = healthState;
		this.isSleep = isSleep;
	}
	
	
	
	void printInfo() {
		System.out.printf("이름 : %s, 성별 : %s, 나이 : %d, 키 : %.2f, 몸무게 : %.2f, 직업 : %s, 혈액형 : %s, 건강상태 : %d, 수면중 : "+isSleep
						,name, gender, age, height, weight, job, blood, healthState);
		
	}
	
	
	
	
	
}



