package study.practice.practice21;


	public class Computer {
		
		//정적 static
		//상수 final -> static final -> 상수인 경우 -> 모두 대문자로 표기
		//public static final String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
		public static final String[] OS_TYPE = {"윈도우10", "애플 OS X", "안드로이드"};
		
		int osIndex;  //0
//		String os;
		int memory;
		
		public Computer(int osIndex, int memory) {
			this.osIndex = osIndex;
//			this.os = osType[osIndex];
			this.memory = memory;
		}
		
		public void print() {
//			System.out.println("운영체제: " + os + " 메인메모리: " + memory);
			System.out.println("운영체제: " + Computer.OS_TYPE[osIndex] + " 메인메모리: " + memory);
		}
		/*
			다음을 만족하는 클래스 Computer를 작성하시오.
			
			· 다음을 상수 필드로 선언
			public … String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
			
			· 다음과 같은 클래스 Computer의 객체의 사용 결과에 적합하도록 생성자와 메소드 구현
			Computer pc = new Computer(0, 16);
			Computer apple = new Computer(1, 32);
			Computer galaxy = new Computer(2, 16);
			pc.print();
			apple.print();
			galaxy.print();
			운영체제: 윈도우10, 메인메모리: 16
			운영체제: 애플 OS X, 메인메모리: 32
			운영체제: 안드로이드, 메인메모리: 16
		 */
	}
