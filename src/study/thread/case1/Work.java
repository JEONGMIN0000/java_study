package study.thread.case1;

public class Work {
	int workCount;
	
	public Work() {
		workCount = 0;
	}
	
	//public synchronized void addCount() {
	public void addCount() {
		workCount++;
	}
}
