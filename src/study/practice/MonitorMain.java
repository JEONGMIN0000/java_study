package study.practice;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterInfo;

public class MonitorMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monitor monitor1 = new Monitor(65, "삼성", "더프레임");
		Monitor monitor2 = new Monitor(80, "LG", "올레드");
		
		monitor1.printInfo();
		monitor2.printInfo();
		
		
	}
	
	
}

