package study.practice.practice26.v2;

public abstract class Unit {
	
	int x, y;  // 현재 위치
	abstract void move(int x, int y); { /* 지정된 위치로 이동 */ } 
	void stop() { /* 현재 위치에 정지 */ }

}
