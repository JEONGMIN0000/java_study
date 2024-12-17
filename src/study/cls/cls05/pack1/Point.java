package study.cls.cls05.pack1;

public class Point {
	
	int math; //점수관리
	int eng; //점수의 범위 0~100
	private int com; //
	
	//getXXX
	//setXXX
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getCom() {
		return this.com;
	}
	
	public void setCom(int com) {
		if(com > 100) {
			this.com = 100;
		} else if(com < 0) {
			this.com = 0;
		} else {
			this.com = com;
		}
		
	}
	
	public Point getPoint() {
		Point p = new Point();
		return new Point();
	}
	
	

}
