package study.practice.practice24;

import java.util.ArrayList;

public class CenterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
			아래 설명에 따라 클래스들의 구조를 잡고 그 이유를 작성하세요.
			(클래스 기준으로 만든다고 생각하고 구조를 잡아보기.)
			
			//교육센터
			//전체직원목록
			//방(호실)목록
			//직원
			//방(Room)
			//강의실
			//휴게실
			//사무실
		 */
		
		Center center = new Center();
		center.staffList = new ArrayList<Staff>();
		center.roomList = new ArrayList<Room>();
		
		center.staffList.add(new Staff());
		center.staffList.add(new Staff());
		center.staffList.add(new Staff());
		
		//강의실 3개 휴게실 2개 사무실 1개
		center.roomList.add(new LectureRoom());
		center.roomList.add(new LectureRoom());
		center.roomList.add(new LectureRoom());
		
		center.roomList.add(new LoungeRoom());
		center.roomList.add(new LoungeRoom());
		
		center.roomList.add(new OfficeRoom());
		
	}

}
