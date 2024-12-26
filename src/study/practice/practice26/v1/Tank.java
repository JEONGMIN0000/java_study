package study.practice.practice26.v1;

public class Tank extends Unit{ // 탱크
	
	public void move(int x, int y) {
		System.out.println("탱크 지정된 위치로 이동 x: "+ x + " y: " + y);
	} //지정된 위치로 이동
	
	public void changeMode() { System.out.println("공격모드를 변환한다"); } //공격모드를 변환한다

}
