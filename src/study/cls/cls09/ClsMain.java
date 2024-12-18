package study.cls.cls09;

import java.util.ArrayList;

public class ClsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LectureRoom room = new LectureRoom();
		room.floor = 7;
		room.roomNumber = 3;
		room.pyeong = 30;
		room.hasWhiteBoard = true;
		
//		room.board = new WhiteBoard();
//		room.board.sizeX = 1200;
//		room.board.sixeY = 800;
		
		WhiteBoard board = new WhiteBoard();
		board.sizeX = 1200;
		board.sixeY = 800;
		board.price = 120000;
		board.isMag = true;
		
		room.board = board;
		
		AirCon con = new AirCon();
		room.airCon = con;
		room.airCon = new AirCon();
		
		room.addDesk(new Desk());
		
		Desk d1 = new Desk();
		//room.deskList = new ArrayList<Desk>();
		
		ArrayList<Desk> deskList = new ArrayList<Desk>();
		for(int i=1; i<=10; i++) {
			Desk d = new Desk();
			d.sizeX = 800;
			d.sizeY = 600;
			d.color = "흰색";
			
			deskList.add(d);
		}
		
		for(int i=1; i<=5; i++) {
			deskList.add(new Desk(1200, 600, "오크색"));
		}
		
		//room.deskList = deskList;
		room.setDeskList(deskList);
		
		//getter List 불러오고 거기다가 한 개 add 추가, 다시 setter 저장
		room.addDesk(new Desk(500, 500, "검정색"));
		
		
		
		
		
		/*
		room. deskList.add(new Desk());
		room.deskList.add(d1);
		
		// 800 600 10개
		for(int i=1; i<=10; i++) {
			Desk d = new Desk();
			d.sizeX = 800;
			d.sizeY = 600;
			d.color = "흰색";
			
			room.deskList.add(d);
		}
		
		// 1200 600 5개
		for(int i=1; i<=5; i++) {
			//1
//			Desk d = new Desk();
//			d.sizeX = 1200;
//			d.sizeY = 600;
//			d.color = "오크색";
			
			//2
//			Desk d = new Desk(1200, 600, "오크색");
//			room.deskList.add(d);
			
			//3
			room.deskList.add(new Desk(1200, 600, "오크색"));
		}
		*/
		
		
		
		
	}

}
