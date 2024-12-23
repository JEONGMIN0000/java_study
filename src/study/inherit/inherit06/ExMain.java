package study.inherit.inherit06;

public class ExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		
		d.drive(b);
		d.drive(t);
		
		Taxi ta = takeTaxi();
		Bus bu = takeBus();
		
		Vehicle v = new Taxi();
		Vehicle v2 = takeBus(); //return Bus
		
		Vehicle b3 = takeBus2();

	}
	
	public static Taxi takeTaxi() {
		return new Taxi();
	}
	
	public static Bus takeBus() {
		return new Bus();
	}
	
	public static Vehicle takeBus2() {
		return new Bus();
	}

}
