package study.cond;

public class Cond02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if문
		
		int dice = 5;
		
		if(dice == 1) {
			System.out.println("한칸 전진");
			
		}
		
		
		if(dice == 1) {
			System.out.println("한칸 전진");
			
		}else {
			System.out.println("주사위 수 대로 전진");	
		}
		
		
		if(dice == 1) {
			System.out.println("1칸 전진");	
		} else if(dice == 2)  {
			System.out.println("2칸 전진");	
		}else if(dice == 3)  {
			System.out.println("3칸 전진");	
		}else if(dice == 4)  {
			System.out.println("4칸 전진");	
		}else if(dice == 5)  {
			System.out.println("5칸 전진");	
		}else {
			System.out.println("6칸 전진");
		}
	
		
		System.out.println("===========switch==========");
		dice = 4;
		
		switch(dice) {
		case 1 : 
			System.out.println("1칸 전진");	
			break;
		case 2 : 
			System.out.println("2칸 전진");	
			break;
		case 3 : 
			System.out.println("3칸 전진");	
			break;
		case 4 : 
			System.out.println("4칸 전진");	
			break;
		case 5 : 
			System.out.println("5칸 전진");	
			break;
		case 6 : 
			System.out.println("6칸 전진");	
			break;
		default : 
			System.out.println("default");
		}
		
		
		int showTime = 8;
		
		if(showTime <= 8) {
			//청소
		}
		if(showTime <= 9) {
			//회의
		}
		if(showTime <= 10) {
			//업무
		}
		
		if(showTime <= 11) {
			//외근
		}
		
		
		if(showTime <= 8) {
			//청소
			//회의
			//업무
			//외근
		}else if(showTime <= 9) {
			//회의
			//업무
			//외근
		}else if(showTime <= 10) {
			//업무
			//외근
		}else if(showTime <= 11) {
			//외근
		}
		
		
		switch(showTime) {
		case 8 : 
			System.out.println("청소");	
		case 9 : 
			System.out.println("회의");	
		case 10 : 
			System.out.println("업무");	
		case 11 : 
			System.out.println("외근");	
		}
		
		
		int goBedTime = 21;
		int sleepTime = 9;
		
		if(goBedTime <= 21) {
			// 일찍잤네
			if(sleepTime >= 9) {
				// 많이 잤네
			}else {
				// 조금 잤네
			}
			
		} else {
			// 좀 늦게 잤네
			if(sleepTime >= 9) {
				// 많이 잤네
			}else {
				// 조금 잤네
			}
		}
		
		// x == 10		x != 10		!(x==10)
		// x < 10		x >= 10		!(x<10)
		// x > 10		x <= 11		!(x>10)
		
		
		
		if(goBedTime <= 21 && sleepTime >= 9) {
			//일찍 많이
		}else if(goBedTime <= 21 && !(sleepTime >= 9)){
			// 일찍 조금
		}else if(goBedTime > 21 && sleepTime >= 9){
			// smwrp aksgdl
		}
		
		
	}

}
