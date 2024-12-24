package study.inter.inter02;

public class GalaxyPhone implements Callable, Connectable{
	
	int callStauts; //전화상태변수

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("갤럭시 전화 검");
		callStauts = Callable.CALL_ON;
		
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("갤력시 블루투스 연결");
		
	}

}
