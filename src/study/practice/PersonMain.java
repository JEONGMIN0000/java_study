package study.practice;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;

public class PersonMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		
		//p1.name="내이름";
		
		Person p2 = new Person("이름","여", 31, 167, 70.4, "학생", "A", 10,  false);
		p2.printInfo();
		
		
		
		
	}
	
}



