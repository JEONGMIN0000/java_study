package study.practice.practice26.v2;

public class Marine extends Unit{ // 보병
	
	public void move(int x, int y) {
		System.out.println("보병 지정된 위치로 이동 x: "+ x + " y: " + y);
	} //지정된 위치로 이동
	
	public void stimPack() { System.out.println("스팀팩을 사용한다"); } //스팀팩을 사용한다

}
