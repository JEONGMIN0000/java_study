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
		
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setStudno(9530); 
		studentDTO.setName("김일번");
		studentDTO.setId("kimone");
		studentDTO.setGrade(4);
		studentDTO.setJumin("0005304444444");
		studentDTO.setBirthday("2000-05-30");
		studentDTO.setTel("02)2000-0530");
		studentDTO.setHeight(153);
		studentDTO.setWeight(53);
		studentDTO.setDeptno1(201);
		studentDTO.setDeptno2(101);
		studentDTO.setProfno(4003);
		
		int result = studentDAO.saveStudent(studentDTO);
		if(result > 0) {
			System.out.println("데이터 저장 성공");
		}

	}

}
