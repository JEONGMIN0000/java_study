package study.thread;

public class Thread02 implements Runnable {

	@Override
	public void run() {
		for(int i=11; i<=20; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
