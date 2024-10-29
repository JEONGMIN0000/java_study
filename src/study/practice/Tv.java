package study.practice;

public class Tv {
	
	int inch;
	int year;
	String brand;
	
	Tv(){
		
	}

	Tv(String brand, int year, int inch){
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}

	void show() {
		System.out.println(brand + "브랜드 " + year + "년형 " + inch+ "인치 TV");
	}
	

}
