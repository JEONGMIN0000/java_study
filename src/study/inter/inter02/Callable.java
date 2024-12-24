package study.inter.inter02;

public interface Callable {
	
	//전화상태
	int CALL_ON = 1; //전화 중인 상태
	public static final int CALL_OFF = 2;
	
	public void call();

}
