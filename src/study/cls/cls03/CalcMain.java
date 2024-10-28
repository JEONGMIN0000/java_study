package study.cls.cls03;

public class CalcMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기본 생성자
		Calc c1 = new Calc();
		
		c1.powerOn();
		
		Calc c2 = new Calc();
		
		c2.powerOn();
		
		c1.setOwner("내이름");
		
		c2.setOwner("내이름");
		
		double result1 = c1.divide(10, 5);
		System.out.println(result1);
		
		System.out.println(c2.divide(3, 2));
		
		String result2 = c1.madeByInfo();
		System.out.println(result2);
		
		System.out.println(c2.madeByInfo());
		
		
		
		
	}
}
