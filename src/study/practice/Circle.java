package study.practice;

public class Circle {
	
		int radius;
		double area;
		
		Circle(){
			
		}
		
		Circle(int radius){
			this.radius = radius;
		}
		
		void setRadius(int radius) {
			this.radius = radius;
		}
		
		double getArea() {
			area = radius*radius*3.14;
			return area;
		}
		
}
