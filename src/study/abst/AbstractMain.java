package study.abst;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coke c1 = new Coke();
		Tera t1 = new Tera();
		//Beverage b1 = new Beverage(); //추상클래스 실체화 불가능
		
		c1.name = "코카콜라"; //부모 클래스 역할 가능 (공통필드)
		c1.ml = 330;
		c1.intro();
		
		Beverage b1 = new Tera();
		b1.intro();
		Tera r2 = (Tera)b1;
		
		Beverage[] bArr = {c1, t1};
		bArr[0].checkSafety();
		bArr[1].checkSafety();
	}

}
