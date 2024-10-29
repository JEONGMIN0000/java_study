package study.practice;

public class Triangle {
	int width;
	int height;
	double area;
	
	Triangle(){
		
	}
	
	Triangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		area = (width*height)/2;
		return area;
	}

}
