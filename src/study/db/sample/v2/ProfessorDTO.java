package study.db.sample.v2;

import java.sql.Date;
import java.time.LocalDateTime;

public class ProfessorDTO {
	
	int profno;
	String name;
	String id;
	String position;
	int pay;
	int deptno;
	String hiredate;
	//LocalDateTime hiredate;

	public int getProfno() {
		return profno;
	}

	public void setProfno(int profno) {
		this.profno = profno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

//	public LocalDateTime getHiredate() {
//		return hiredate;
//	}
//
//	public void setHiredate(LocalDateTime hiredate) {
//		this.hiredate = hiredate;
//	}
	
	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	
	
	public ProfessorDTO() {};
	
	public ProfessorDTO(int profno, String name, String id, String position, int pay, int deptno) {
		super();
		this.profno = profno;
		this.name = name;
		this.id = id;
		this.position = position;
		this.pay = pay;
		this.deptno = deptno;
	}

}
