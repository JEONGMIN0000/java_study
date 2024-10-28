package study.cls.cls02;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		System.out.println(car1.color);
		
		car2.color="파랑";
		System.out.println(car2.color);
		
		System.out.println(car3.color);
		System.out.println(car3.price);
		
		
		System.out.println("main 끝");
		
		int num = 10;
		
		Car car4 = new Car("모닝");
		System.out.println(car4.model);
		System.out.println(car4.color);
		
		Car car5 = new Car("캐스퍼","회색");
		System.out.println(car5.model);
		System.out.println(car5.color);
		
	}

}
