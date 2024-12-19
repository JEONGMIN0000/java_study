package study.inherit.inherit01;

public class Parent {
	int money;
	
	public Parent(int money) {
		this.money = money;
		System.out.println("Parent 클래스 생성자");
	}

	public void say() {
		System.out.println("부모님 말씀");
	}
}
