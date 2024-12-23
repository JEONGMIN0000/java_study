package study.inherit.inherit05;

public class CarExample {
	public static void main(String[] args) {
		Tire t1 = new KumhoTire ("앞왼쪽", 15);
		Tire t2 = new KumhoTire ("앞오른쪽", 15);
		Tire t3 = new KumhoTire ("뒤왼쪽", 15);
		Tire t4 = new KumhoTire ("뒤오른쪽", 15);
		Car car = new Car(t1, t2, t3, t4);

		for (int i = 1; i <= 10; i++) {
			int problemLocation = car.run();
			 // 1 2 3 4 : 0 정상
			// 0 1 2 3 : 10 정상
			switch (problemLocation) {
			case Car.FRONT_LEFT_TIRE:
				System.out.println("앞왼쪽 HankookTire로 교체");
				//car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				car.tireArr[Car.FRONT_LEFT_TIRE] = new HankookTire("앞왼쪽", 15);
				break;
			case Car.FRONT_RIGHT_TIRE:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				//car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				car.tireArr[Car.FRONT_RIGHT_TIRE] = new KumhoTire("앞오른쪽", 13);
				break;
			case Car.BACK_LEFT_TIRE:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				//car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				car.tireArr[Car.BACK_LEFT_TIRE] = new HankookTire("뒤왼쪽", 14);
				break;
			case Car.BACK_RIGHT_TIRE:
				System.out.println("뒤오른쪽 NexenTire로 교체");
				//car.backRightTire = new NexenTire("뒤오른쪽", 17);
				car.tireArr[Car.BACK_RIGHT_TIRE] = new NexenTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("----------------------------------------");
		}
	}
}
