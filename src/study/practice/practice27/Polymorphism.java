package study.practice.practice27;

public class Polymorphism {
	public static void main(String[] args) {
// 성기사 객체 생성
		HolyKnight uther = new HolyKnight("우서", 180);

// 탱커로서의 역할 수행
		Tanker t = uther;
		t.increaseHp();

// 힐러로서의 역할 수행
		Healer h = uther;
		h.heal();
	}
}

interface Tanker {
	public void increaseHp();
}

interface Healer {
	public void heal();
}

/* 1. 탱커와 힐러 역할을 부여하세요. */
class HolyKnight implements Healer, Tanker {
	
	private String name;
	private int hp;

	public HolyKnight(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	
	/* 2. Tanker의 메소드를 오버라이딩하세요. */
	public void increaseHp() {
		System.out.printf("전체 체력을 +50 증가시킵니다. \n");
		hp = hp + 50;
		System.out.println(hp);
	}
	
	/* 3. Healer의 메소드를 오버라이딩하세요. */
	public void heal() {
		System.out.printf("체력을  +30 회복합니다. \n");
		hp = hp + 30;
		System.out.println(hp);
	}
	
}
