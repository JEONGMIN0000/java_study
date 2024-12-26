package study.exp;

import java.util.ArrayList;
import java.util.List;

public class Exp03 {

	public static void main(String[] args)  {
		Sample s = new Sample();

		try {
			s.addItem1("하나");
		} catch (Exception e) {
			System.out.println("main에서 하나 예외처리");
		}

		try {
			s.addItem2("둘");
		} catch (Exception e) {
			System.out.println("main에서 둘 예외처리");
		}

		//		s.addItem1("1");
		//		s.addItem2("2");

		try {
			s.addItem3("3");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("main에서 addItem3 호출 후 예외처리");
		}

		try {
			s.addItem4("4");
		} catch (NullPointerException e) {

		}

		//s.addItem3("5");

		s.addItem2("저장");
		System.out.println(s.list.get(0));
		System.out.println(s.list.get(1));

		try {
			s.addItem5("55");
		} catch (Exception e) {
			System.out.println("main에서 addItem5에 throw e 처리");
		}

		int result = s.addItem6("66");
		if(result == 1) {
			//O
		} else {  //if result == -1
			//X Exception
		}

		try {
			s.addItem7("77");
			
		} catch (InvalidParameterValueException e) {
			e.printStackTrace();
			
		} catch (ListFullException e) {
			e.printStackTrace();
		}

	}
}

class Sample {

	List<String> list;

	void addItem1(String s) {
		list.add(s);
	}

	void addItem2(String s) {
		try {
			list.add(s); //예외발생
		}catch (Exception e) {
			System.out.println("Sample addItem2에서 예외 처리 ");

			if( list == null ) {
				list = new ArrayList<String>();
				list.add(s);
			}
		}
	}

	void addItem3(String s) throws Exception {
		list.add(s);
	}

	void addItem4(String s) throws NullPointerException {
		list.add(s);
	}

	void addItem5(String s) throws Exception {

		try {
			//list.add(s); //예외발생
			list.get(10);
		} catch (Exception e) {
			System.out.println("Sample addItem5에서 예외 처리 ");
			throw e;
		}
	}

	int addItem6(String s) {

		try {
			list.add(s);
		} catch (Exception e) {
			//잘못됐다~
			return -1; //예외발생
		}

		return 1;  //1 반환 : 정상

		//return 1   2 3 
		//Exception -1 
	}

	void addItem7(String s) throws InvalidParameterValueException, ListFullException {

		if( s == null ) {  //|| || || 
			throw new InvalidParameterValueException();
		}

		try {
			list.add(s);
		} catch (Exception e) {
			// new list[10] 개짜리
			// list[10] 저장시도
			throw new ListFullException();
		}
	}
}


class ListFullException extends Exception { }

class InvalidParameterValueException extends Exception { }





















