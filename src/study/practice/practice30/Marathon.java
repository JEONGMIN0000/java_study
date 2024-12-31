package study.practice.practice30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Marathon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> participant = new HashMap<Integer, String>();
		Map<Integer, String> completion = new HashMap<Integer, String>();
		
	
		participant.put(1,"leo");
		participant.put(2,"kiki");
		participant.put(3,"eden");
		participant.put(4,"mislav");
		participant.put(5,"stanko");
		participant.put(6,"mislav");
		participant.put(7,"ana");
		
		completion.put(3,"eden");
		completion.put(2,"kiki");
		completion.put(5,"stanko");
		completion.put(6,"mislav");
		completion.put(7,"ana");
		
		solution(participant, completion);
		
	}
	
	static void solution(Map<Integer, String> participant, Map<Integer, String> completion) {
		
		Map<Integer, String> resultMap = new HashMap<>(participant);
		
		for(Integer id : completion.keySet()) {
			resultMap.remove(id);
		}
		
		 for (Map.Entry<Integer, String> entry : resultMap.entrySet()) {
	            System.out.println("비완주자 : " + entry.getKey() + " , " + entry.getValue());
	        }
		
		
	}

}
