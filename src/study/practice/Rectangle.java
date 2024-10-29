package study.practice;

public class Rectangle {
	int width;
	int height;
	double area;
	
	Rectangle(){
		
	}
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	double getArea() {
		area = width*height;
		return area;
	}
}
