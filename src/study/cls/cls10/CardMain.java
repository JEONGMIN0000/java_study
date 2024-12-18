package study.cls.cls10;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("나이름","1234");
		s1.card = new Card(1, "신한","체크", "나이름");
		
		AttendTool tool = new AttendTool();
		tool.isOn = true;
		tool.forOrg = "센터";
		
		//학생 -> (카드) -> 출결도구 
		boolean result = tool.checkAttend(s1.card);
		if(result) {
			
		}else {
			//다시시도
		}
		
		int r =  tool.checkAttend2(s1.card);
		if(r==1) {}
		else if(r==2) {}
		else {}
		
		tool.checkAttend(s1.card, s1);
	}

}
