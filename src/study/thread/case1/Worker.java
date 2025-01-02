package study.thread.case1;

public class Worker extends Thread {
	
	String name;
	int workLoad;
	Work work;
	
	public Worker(String name, int workLoad, Work work) {
		this.name = name;
		this.workLoad = workLoad;
		this.work = work;
	}
	
	public void run() {
		
		for(int i=1; i<=workLoad; i++) {
	
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			synchronized (work) { //공유 객체 기준으로 쓰레드 동기화
				work.addCount();
				System.out.println(name + " : " + work.workCount);
			}
		}
	}
}
