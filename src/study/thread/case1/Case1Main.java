package study.thread.case1;

public class Case1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Work work = new Work();
		
		Worker w1 = new Worker("A", 30, work); 
		Worker w2 = new Worker("B", 30, work);
		
		w1.start();
		w2.start();
	}

}
