package study.inherit.inherit04.v2;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner();
		Cleaner c3 = new WindowCleaner();
		Cleaner c4 = new FloorCleaner();
		
//		c1.removeDust();
//		DustCleaner dc = new DustCleaner();
//		dc.removeDust();
//		c2.removeDust();
		
		List<Cleaner> list = new ArrayList<Cleaner>();
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		
		for(Cleaner c : list) {
			c.removeDust();
			c.washWindow();
			c.cleanFloor();
		}
		
		
//		for(int i=0;i<dustArr.length;i++) {
//			dustArr[i].removeDust();
//		}
//		
//		for(int i=0; i<windowList.size();i++) {
//			windowList.get(i).washWindow();
//		}
//		
//		for(FloorCleaner fc : floorList) {
//			fc.cleanFloor();
//		}

	}

}
