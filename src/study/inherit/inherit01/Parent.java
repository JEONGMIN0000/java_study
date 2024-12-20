package study.inherit.inherit01;

public class Parent extends GrandParent {
	//public int money;
	protected int money;
	//protected = default + 자식클래스 접근가능
	
//	public Parent() {
//
//	}

	public Parent(int money) {
		this.money = money;
		System.out.println("Parent 클래스 생성자");
	}

	public void say() {
		System.out.println("부모님 말씀");
	}
}
