package study.inherit.inherit01;

public class IngeritMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1 = new Parent(5000);
		//p1.money = 5000;
		p1.say();
		
		Child c1 = new Child();
		c1.grade = 3;
		c1.play();
		
		System.out.println(c1.money);
		c1.say();
		
		Child c2 = new Child(5, "중앙초", 3000);
		c2.say();
		c2.play();
		System.out.println(c2.grade + c2.schoolName + c2.money);
	}

}
