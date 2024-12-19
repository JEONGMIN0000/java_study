package study.practice.practice21;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("나부자", 5000);
		System.out.println(a1.deposit(3000) + "원 입금했습니다");
		System.out.println("잔액:" + a1.getBalance());
		
		System.out.println(a1.withdraw(6000) + "원 출금했습니다");
		System.out.println("잔액:" + a1.getBalance());
		
		System.out.println(a1.withdraw(10000) + "원 출금했습니다");
		System.out.println("잔액:" + a1.getBalance());
	}

}
