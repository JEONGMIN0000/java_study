package study.exp;

public class Exp02 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		try {
			
//			arr = null;
			arr[5] = 10;
			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException  catch block ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException  catch block ");
		} catch (Exception e ) {
			System.out.println("Exception catch block");
		} 

	}

}
