package study.practice.practice26.v2;

public class UnitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tank t1 = new Tank();
		Dropship d1 = new Dropship();
		Marine m1 = new  Marine();
		Marine m2 = new  Marine();
		Marine m3 = new  Marine();
		
		Unit[] bd1 = {t1, d1, m1, m2, m3};
		//bd1 반복 => .move()~
		
		Unit[] bd2 = {m1, m2, m3};
		((Marine)bd2[0]).stimPack();
		
		Marine mm = (Marine)bd2[1];
		mm.stimPack();
		
		Marine[] mrbd = {m1, m2, m3};
		mrbd[0].stimPack();
		
		//Unit u1 = new Unit();
		
	
	}

}
