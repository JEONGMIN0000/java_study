package study.coll;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//json object { key : value }
		
		//Key, Value
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "김하나");
		map1.put(2, "정둘");
		map1.put(3, "이삼");
		
		System.out.println(map1.containsKey(2));
		System.out.println(map1.containsKey(4));
		

		System.out.println(map1.containsValue("박사"));
		System.out.println(map1.containsValue("김하나"));
		
		System.out.println(map1.get(3));
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("당번", "지각생");
		System.out.println(map2.get("당번"));
		
		Set<Integer> map1Key = map1.keySet();
		//map1Key.iterator()
		
		for(Integer key : map1.keySet()) {
			System.out.println(key);
		}
		
		for(String value : map1.values()) {
			System.out.println(value);
		}
		
		Set<Entry <Integer, String> > entrySet = map1.entrySet();
		
		for(Entry <Integer, String> entry : map1.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		for(Integer key : map1.keySet()) {
			System.out.println(key+ " : " + map1.get(key));
		}
	}

}
