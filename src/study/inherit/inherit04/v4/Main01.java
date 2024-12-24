package study.inherit.inherit04.v4;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Cleaner c1 = new Cleaner();
//		Cleaner c2 = new DustCleaner();
//		Cleaner c3 = new WindowCleaner();
//		Cleaner c4 = new FloorCleaner();
//		
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
			c.doClean();
			
			if( c instanceof DustCleaner ) {
				DustCleaner d = (DustCleaner)c;
				d.arrangeItem();
			}

		}
		
		Cleaner c1 = new DustCleaner();
		c1.doClean();
		DustCleaner d1 = (DustCleaner)c1;
		d1.doClean();
		d1.arrangeItem();

	}

}
