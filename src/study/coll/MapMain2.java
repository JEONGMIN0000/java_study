package study.coll;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Score> map = new HashMap<String, Score>();
		
		Score s1 =  new Score();
		s1.setMath(100);
		s1.setEng(50);
		s1.setLang(80);
		
		map.put("김하나", s1);
		
		map.put("정둘", new Score(80, 60, 40));
		
		System.out.println( map.get("정둘"));
		System.out.println( map.get("정둘").getMath());
		
		System.out.println( map.get("김하나").getEng());
		
		
	}

}

class Score {
	int math;
	int eng;
	int lang;
	
	public Score(){}
	
	public Score(int math, int eng, int lang) {
		super();
		this.math = math;
		this.eng = eng;
		this.lang = lang;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getLang() {
		return lang;
	}
	public void setLang(int lang) {
		this.lang = lang;
	}
	
	@Override
	public String toString() {
		return "Score [math=" + math + ", eng=" + eng + ", lang=" + lang + "]";
	}

	
}
