package study.practice.practice26.v1;

public class Dropship extends Unit{ // 수송선
	
	public void move(int x, int y) {
		System.out.println("수송선 지정된 위치로 이동 x: "+ x + " y: " + y);
	} //지정된 위치로 이동
	
	public void load() { System.out.println("선택된 대상을 태운다"); } //선택된 대상을 태운다
	
	public void unload() { System.out.println("선택된 대상을 내린다"); } //선택된 대상을 내린다

}
