package study.practice.practice21;

public class Student {
	
	private String dept;
	private int stuNum;
	
	

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
	
	void printInfo() {
		System.out.printf("%s과 %d학번", dept, stuNum);
	}

}
