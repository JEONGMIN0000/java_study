package study.practice.practice20;

public class AccountTest {
	public static void main(String[] args) {
		// 객체 생성
		Account a = new Account("123-45", 10000);
		Account b = new Account("567-89", 10000);

		// 송금: 3천원씩 a 계좌에서 -> b계좌로!
		boolean result = true;
		
		while (result) {
			//result = a.transfer(b, 3000);
			result = b.transfer(a, 3000);
		}

		// 결과 출력
		System.out.println(a.toString());	//10000 -> 7000 -> 4000 -> 1000
		System.out.println(b.toString());	//10000 -> 13000 -> 16000 -> 19000
	}
}

class Account {
	String num; // 계좌번호
	int balance; // 잔액

	public Account(String str, int i) {
		num = str;
		balance = i;
	}

	public String toString() {
		//            printf( %s 문자, %d 정수숫자
		// return "Account { num: " + num + ", balance: " + balance + " }";
		return String.format("Account { num: %s, balance: %d }", num, balance);
	}

	public boolean transfer(Account target, int amount) {
		
		//잔액     송금할 금액
		//5000    2000
		//잔액  >= 송금할 금액    가능한 경우
		//잔액  < 송금할 금액    불가능 -> return false
		
		/* 1. 잔액이 부족한 경우 false를 반환하세요. */
		if ( balance < amount ) {
			return false;
		}

		/* 2. 현재 잔액에서 송금액을 이체대상 계좌로 전달하세요. */
		balance -= amount;		//내 계좌에서 송금할 금액만큼 차감
		target.balance += amount; //입금할 상대계좌의 잔액을 송금할 금액만큼 증가
		
		return true;
	}
}