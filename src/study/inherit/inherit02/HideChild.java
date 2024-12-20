package study.inherit.inherit02;

import study.inherit.inherit01.Parent;

public class HideChild extends Parent {

	public HideChild(int money) {
		super(money);
	}
	
	public void printInfo() {
		System.out.println(money);
	}

}
