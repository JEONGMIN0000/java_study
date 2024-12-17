package study.practice.practice19;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;

public class MonitorMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monitor monitor1 = new Monitor("삼성", 27, 150000);
		monitor1.setColor("검은색");
		monitor1.setXY(1080,780);
		
		Monitor monitor2 = new Monitor("LG", 32, 330000);
		monitor2.setColor("흰색");
		monitor2.setXY(4096,2048);
		
		System.out.println("인상 전");
		monitor1.printInfo();
		monitor2.printInfo();
		
		monitor2.addPrice(70000);
		
		System.out.println("인상 후");
		monitor1.printInfo();
		monitor2.printInfo();
		
	
		
	}
	
	
}

