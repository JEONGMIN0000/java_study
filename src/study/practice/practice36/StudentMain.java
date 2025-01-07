package study.practice.practice36;

import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		StudentDAO studentDAO = new StudentDAO();
		
		
		System.out.println("학년별 조회");
		List<StudentDTO> gradeList = studentDAO.findStudentListByGrade(3);
		
		for(StudentDTO s : gradeList) {
			System.out.println(s.toString());
			
			//birthday가 LocalDateTime 이면
			//System.out.println(ConvertDateUtil.convertlocalDateTimeToString(s.getBirthday()));
		}
		
		
		System.out.println("전체 학생 조회");
		List<StudentDTO> studentList = studentDAO.findStudentList();
		
		for(StudentDTO s : studentList) {
			System.out.println(s.toString());
		}

	}

}
