package study.practice.practice31;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvenThread et = new EvenThread();
		OddThread ot = new OddThread();
		
//		et.start();
//		ot.start();
		
		EvenRunnable er = new EvenRunnable();
		Thread t1 = new Thread(er);
		Thread t2 = new Thread(new OddRunnable());
		
//		t1.start();
//		t2.start();
		
		NumberThread nt1 = new NumberThread(true);
		NumberThread nt2 = new NumberThread(false);
		

	}

}

class NumberThread extends Thread {
	
	boolean isOdd;
	int remain;
	
	public NumberThread(boolean isOdd) {
		this.isOdd  = isOdd;
		if(isOdd) {
			remain = 1;
		}else {
			remain = 0;
		}
	}
	
	public void run() {
		
		for(int i=1; i<=100; i++) {
			
			if(i%2 == remain) {
				System.out.println(i);
			}
			
			if(isOdd) {
				if(i%2 == 1) {
					System.out.println(i);
				}
			} else {
				if(i%2 == 0) {
					System.out.println(i);
				}
			}
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
		
	}
	
}

class EvenThread extends Thread{
	
	public void run() {
		
		for(int i=1;i<=100;i++) {
			if(i%2 == 0) {
				System.out.println(i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}

class OddThread extends Thread{
	
	public void run() {
		
		for(int i=1;i<=100;i+=2) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class EvenRunnable implements Runnable {
	public void run() {
		
		for(int i=1;i<=100;i++) {
			if(i%2 == 0) {
				System.out.println(i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}

class OddRunnable implements Runnable {
	public void run() {
		
		for(int i=1;i<=100;i+=2) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}