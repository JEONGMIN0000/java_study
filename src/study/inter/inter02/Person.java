package study.inter.inter02;

public class Person {
	
	//Phone p;
	GalaxyPhone gp;
	Iphone ip;
	
	Callable callPhone; // new GalaxyPhone()  new Iphone()
	
	public void call(String PhoneNumber) {
		//phoneNumber 쪽 전화번호로 전화를 걸자
		callPhone.call();
	}
}
