package study.cls.cls10;

public class AttendTool { //출결도구
	
	boolean isOn;
	String forOrg;
	String hand;
	//센터 서버
	//학생 명단
	
	//출석체크
	
	//출석체크 결과 -> 정상 true 실패 false
	// int 1 출석성공 2 퇴실성공 3 실패
	public int checkAttend2(Card card) {
		//card 확인
		
		//오늘 기록 X -> 출석
		return 1;
		
		//출석리록 -> 퇴실
		//return 2;
		
		//문제 -> 처리실패
		//return 3;
	}
	public boolean checkAttend(Card card) {
		//구성원 목록
		
		//목록 == card.id
		
		//출석상태 체크
		//X -> 출석 O
		//출석 O -> 퇴실 
		
		return true;
	}
	
	//출결체크 (학생 지문 + 카드)
	public boolean checkAttend(Card card, Student s) {
		//s.card
		//s.hand
		
		return false;
	}
	
		
}
