package study.practice.practice30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Marathon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]  participant1 = {"leo", "kiki", "eden"};
		String[] completion1 = {"eden", "kiki"};
		
		String[]  participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion2 = {"josipa","filipa", "marina", "nikola"};
		
		String[]  participant3 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion3 = {"stanko", "ana", "mislav"};
		
		String result1 = solution(participant1, completion1);
		System.out.println(result1); //leo
		
		String result2 = solution(participant2, completion2);
		System.out.println(result2); //vinko
		
		String result3 = solution(participant3, completion3);
		System.out.println(result3); //mislav
		
	}
	
	public static String solution(String[] participant,String[] completion) {
		
		/*
		//1 Arraylist 활용
		//참가자 목록에서 완주자 목록에 있는 이름을 하나씩 지우기
		List<String> partList = new ArrayList<String>(List.of(participant));
		List<String> compList = new ArrayList<String>(List.of(completion));
		
		for(String s : compList) {
			partList.remove(s);
		}
		
		return partList.get(0); //이름 리턴
		*/
		
		/*
		//2 HashSet 활용
		//완주자 목록 추가 -> 참가에서 한개씩 지우기
		Set<String> compSet = new HashSet<String>();
		for(String s : completion) {
			compSet.add(s); //완주자 목록
		}
		
		//참가자 값을 compSet체서 확인해서 있는지 확인?
		//있다? -> 삭제 , 없다? -> 완주 못했다
		for(String s : participant) {
			if(compSet.contains(s)) { //있다?  삭제
				compSet.remove(s);
			} else { //없다? 완주못했다
				return s; //조건 안에있는 return 실행이 안될수도 있다고 판단됨
			}
		}
		return null; //리턴 명시 필수 
		*/
		
		//3 HashMap 활용
		
		// 이름  갯수
		Map<String, Integer> pMap = new HashMap<String, Integer>();
		
		for(String s : participant) { 
			
			if(pMap.containsKey(s)) { //이미 이름이 있다
				pMap.put(s, pMap.get(s)+1);
			} else { //이름이 없다
				pMap.put(s, 1);
			}
		}
		
		for(String s : completion) {
			pMap.put(s, pMap.get(s) -1);

			//if(pMap.get(s) == 0) 
			//	pMap.remove(s);
		}
		
		for(String key : pMap.keySet()) {
			if(pMap.get(key) == 1) { //미완주자 (완주자들은 value 가 0)
				return key;
			}
		}
		return null;
		
	}

}
