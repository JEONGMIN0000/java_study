package study.cls.cls07;

public class ClsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int n2 = 10;
		int n3 = 10;
		int[] nArr = {10, 20};
		int[] nArr2 = new int[5];
		nArr2[1] = 500;
		
		int[] rArr = methodC(nArr);
		for(int i : rArr) {
			System.out.println(i);
		}
		
		Temp t = new Temp();
		Temp t2 = new Temp();
		Temp t3 = new Temp();
		
		Temp[] tArr = {t, t2, t3};        
		Temp[] tArr2 = new Temp[5];
		tArr2[1] = new Temp();
		
		for(int i=0; i<tArr.length; i++) {
			tArr[i].print();
		}
		
		System.out.println();
		
		Temp[] dArr = methodD(tArr);
		for(Temp item : dArr) {
			item.print();
		}
	}
	
	
	public static int methodA(int n) {
		int r = n + 10;
		return r;
	}
	
	public static Temp methodB(Temp p) {
		Temp p2 = p;
		return new Temp();
	}
	
	public static int[] methodC(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			//arr[i] += 10;
		}
		System.out.println();
		
		int[] arr2 = {20, 30, 50};
		return arr2;
	}
	
	public static Temp[] methodD(Temp[] arr) {
		
		for(Temp t : arr) {
			t.print();
		}
		
		Temp[] arr2 = new Temp[2]; // Temp 값을 담을 수 있는 2칸 짜리 배열 선언
		//{null, null}
		arr2[0] = new Temp(); // 해당 배열 인데스 위치에 Temp 객체 생성
		arr2[1] = new Temp(); // 해당 배열 인데스 위치에 Temp 객체 생성
		
		
		return arr2;
	}

}
