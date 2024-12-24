package study.inter.inter02;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		
		p.callPhone = new Iphone();
		
		p.call("1234123224");
		
		p.callPhone = new GalaxyPhone();
		p.call("1234123224");
		
		p.callPhone = new LgPhone();
		p.call("1234123224");

	}

}
