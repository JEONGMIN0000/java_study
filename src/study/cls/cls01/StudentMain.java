package study.cls.cls01;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int[] arr = new int [3];
		
		Student stu1 = null;
		stu1 = new Student();
		
		Student stu2 = new Student();
		
		Scanner scanner = new Scanner(System.in);
		
		stu1.name = "이름일";
		stu2.name = "이름이";
		
		System.out.println(stu1.name);
		System.out.println(stu2.name);
		
		stu1.grade = 3;
		stu2.grade = 5;
		
		System.out.println(stu1.grade);
		System.out.println(stu2.grade);
	}

}
