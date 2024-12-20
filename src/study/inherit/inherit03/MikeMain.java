package study.inherit.inherit03;

import java.util.ArrayList;
import java.util.List;

public class MikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BluetoothMike m1 = new BluetoothMike();
		m1.volumeUp();
		m1.volumeUp("sdfa");
		
		WirelessMike m2 = new WirelessMike();
		m2.volumeUp();
		
		Mike m3 = new Mike();
		m3.volumeUp();
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		WirelessMike m4 = m2;
		Mike m5 = m1;
		Mike m6 = m2;
		
		Mike m7 = new BluetoothMike();
		Mike m8 = new WirelessMike();
		
		
		int[] arri = {1,2,3,4,6};
		Mike[] arr = {new Mike(), new BluetoothMike(), new WirelessMike()};
		
		List<Mike> list = new ArrayList<Mike>();
		list.add(new Mike());
		list.add(new BluetoothMike());
		list.add(new WirelessMike());


	}

}
