package study.practice.practice22;

public class Gas {
	
	int fireCount;
	String brand;
	int price;
	
	int fireLevel; //불단계 ( 0 ~ 10 )
	
	public void fireOn() {
		fireLevel = 1;
	}
	
	public void fireOff() {
		fireLevel = 0;
	}
	
	// setFireLevel(9);
	public void setFireLevel(int fireLevel) {
		this.fireLevel = fireLevel;
	}

}
