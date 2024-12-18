package study.cls.cls10;

public class Card { //출결카드
	
	int id; //고유번호
	String source;
	String type;
	String owner; //카드주인
	
	public Card(int id, String source, String type, String owner) {
		this.id = id;
		this.source = source;
		this.type = type;
		this.owner = owner;
	}

}
