package study.inter.inter01;

public class TempMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Temp t = new Temp(); //인터페이스 생성 불가
		TempObject t1 = new TempObject();
		
		Temp t = new TempObject();
		Temp2 t2 = new TempObject();
		
		Temp[] tArr = new Temp[3];
		//tArr[0] = new Temp(); //XX
		tArr[0] = new TempObject();
		
		//상속 : 부모클래스 타입 = 자식객체
		//인터페이스 : 인터페이스 타입 = 구현객체 ( 해당 인터페이스를 구현한)

	}

}
