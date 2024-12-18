package study.cls.cls08;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = new String[4];
		
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		arr[3] = "D";
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		arr[2] = null;
		
		for(String item : arr) {
			System.out.print(item + " ");
		}
		System.out.println();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("ㄱ");
		list.add("ㄴ");
		list.add("ㄷ");
		list.add(0,"ㄹ");
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		//list.set(2, null);
		list.remove(2);
		
		for(String item : list) {
			System.out.print(item + " ");
		}
		System.out.println();
		
	}

}
