package study.cls.cls05.pack1;

import study.cls.cls05.pack2.Cup;

public class CupMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cup c1 = new Cup();
		c1.method();
		
		study.cls.cls05.pack2.Cup c2 = new study.cls.cls05.pack2.Cup();   //임포트하면 임포트한 경로에있는 Cup가 기본
		c2.method();
		
		study.cls.cls05.pack1.Cup c3 = new study.cls.cls05.pack1.Cup("유리컵");  //임포트할때는 다른Cup는 경로까지 명시해야 불러와짐 
		c3.method();
		//c3.type = "유리컵";
		
		Cup cc = new Cup();
		cc.type = "머그컵";
		cc.method();

	}

}
