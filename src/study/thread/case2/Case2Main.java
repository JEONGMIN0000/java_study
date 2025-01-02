package study.thread.case2;

public class Case2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Work work = new Work(60);
		
		Thread t1 = new Thread(work);
		Thread t2 = new Thread(work);
		
		t1.start();
		t2.start();
		
	}

}
