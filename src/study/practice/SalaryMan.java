package study.practice;

public class SalaryMan {
	
	//월 급여액
	int salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
		
	}
	
	
	public SalaryMan(){
		this.salary = 1000000;
	}
	
	
	public SalaryMan(int salary){
		this.salary = salary;
	}
	
	
	//연봉 반환 메소드
	public int getAnnualGross() {
		
		//연봉 : 월급 1년치 + 상여금(보너스 월급 500%) 로 계산
		return (salary*12) + (salary*5);
		
	}
	
	

}
