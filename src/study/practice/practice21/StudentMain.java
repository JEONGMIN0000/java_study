package study.practice.practice21;

public class StudentMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.setDept("컴공");
		s1.setStuNum(4321);
		
		s1.printInfo();
		System.out.println();
		System.out.println("학과 : " + s1.getDept() + " 학번 : " + s1.getStuNum());

	}
}
